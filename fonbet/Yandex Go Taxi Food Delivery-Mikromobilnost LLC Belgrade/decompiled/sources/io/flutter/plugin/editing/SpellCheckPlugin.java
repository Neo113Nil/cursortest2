package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import defpackage.da20;
import defpackage.opt0;
import defpackage.y5z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes4.dex */
public class SpellCheckPlugin implements SpellCheckerSession.SpellCheckerSessionListener {
    public static final String END_INDEX_KEY = "endIndex";
    private static final int MAX_SPELL_CHECK_SUGGESTIONS = 5;
    public static final String START_INDEX_KEY = "startIndex";
    public static final String SUGGESTIONS_KEY = "suggestions";
    private final opt0 mSpellCheckChannel;
    private SpellCheckerSession mSpellCheckerSession;
    private final TextServicesManager mTextServicesManager;
    da20 pendingResult;

    public SpellCheckPlugin(TextServicesManager textServicesManager, opt0 opt0Var) {
        this.mTextServicesManager = textServicesManager;
        this.mSpellCheckChannel = opt0Var;
        opt0Var.a = this;
    }

    public void destroy() {
        this.mSpellCheckChannel.a = null;
        SpellCheckerSession spellCheckerSession = this.mSpellCheckerSession;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void initiateSpellCheck(String str, String str2, da20 da20Var) {
        if (this.pendingResult != null) {
            da20Var.error("error", "Previous spell check request still pending.", null);
        } else {
            this.pendingResult = da20Var;
            performSpellCheck(str, str2);
        }
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.pendingResult.success(new ArrayList());
            this.pendingResult = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.pendingResult.success(new ArrayList());
            this.pendingResult = null;
            return;
        }
        for (int i = 0; i < sentenceSuggestionsInfo.getSuggestionsCount(); i++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i) + offsetAt;
                hashMap.put(START_INDEX_KEY, Integer.valueOf(offsetAt));
                hashMap.put(END_INDEX_KEY, Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z = false;
                for (int i2 = 0; i2 < suggestionsCount; i2++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i2);
                    if (!suggestionAt.equals("")) {
                        arrayList2.add(suggestionAt);
                        z = true;
                    }
                }
                if (z) {
                    hashMap.put(SUGGESTIONS_KEY, arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.pendingResult.success(arrayList);
        this.pendingResult = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }

    public void performSpellCheck(String str, String str2) {
        Locale a = y5z.a(str);
        if (this.mSpellCheckerSession == null) {
            this.mSpellCheckerSession = this.mTextServicesManager.newSpellCheckerSession(null, a, this, true);
        }
        this.mSpellCheckerSession.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }
}
