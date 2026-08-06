package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import b1.C0130a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g implements SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a, reason: collision with root package name */
    public final Z0.i f7802a;

    /* renamed from: b, reason: collision with root package name */
    public final TextServicesManager f7803b;

    /* renamed from: c, reason: collision with root package name */
    public SpellCheckerSession f7804c;

    /* renamed from: d, reason: collision with root package name */
    public Z0.j f7805d;

    public g(TextServicesManager textServicesManager, Z0.i iVar) {
        this.f7803b = textServicesManager;
        this.f7802a = iVar;
        iVar.f1992b = this;
    }

    public final void a(String str, String str2, Z0.j jVar) {
        if (this.f7805d != null) {
            jVar.a("error", "Previous spell check request still pending.", null);
            return;
        }
        this.f7805d = jVar;
        Locale a2 = C0130a.a(str);
        if (this.f7804c == null) {
            this.f7804c = this.f7803b.newSpellCheckerSession(null, a2, this, true);
        }
        this.f7804c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f7805d.c(new ArrayList());
            this.f7805d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f7805d.c(new ArrayList());
            this.f7805d = null;
            return;
        }
        for (int i2 = 0; i2 < sentenceSuggestionsInfo.getSuggestionsCount(); i2++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i2);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i2);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i2) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z2 = false;
                for (int i3 = 0; i3 < suggestionsCount; i3++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i3);
                    if (!suggestionAt.isEmpty()) {
                        arrayList2.add(suggestionAt);
                        z2 = true;
                    }
                }
                if (z2) {
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.f7805d.c(arrayList);
        this.f7805d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
