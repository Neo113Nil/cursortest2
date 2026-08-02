package com.squareup.cash.formview.components;

import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import com.squareup.cash.formview.components.arcade.ArcadeFormHeroHeaderKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.cash.StringsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import squareup.cash.ui.arcade.elements.HeroHeader;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormElementViewBuilder$$ExternalSyntheticLambda17 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FormBlocker.Element.HeroHeaderElement f$0;

    public /* synthetic */ FormElementViewBuilder$$ExternalSyntheticLambda17(FormBlocker.Element.HeroHeaderElement heroHeaderElement, int i) {
        this.$r8$classId = i;
        this.f$0 = heroHeaderElement;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        LocalizedString localizedString;
        LocalizedString localizedString2;
        int i = this.$r8$classId;
        String str = null;
        FormBlocker.Element.HeroHeaderElement heroHeaderElement = this.f$0;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeFormHeroHeaderKt.ArcadeFormHeroHeader(heroHeaderElement, null, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    HeroHeader heroHeader = heroHeaderElement.header;
                    String translated = (heroHeader == null || (localizedString2 = heroHeader.title_text) == null) ? null : StringsKt.translated(localizedString2);
                    HeroHeader heroHeader2 = heroHeaderElement.header;
                    if (heroHeader2 != null && (localizedString = heroHeader2.body_text) != null) {
                        str = StringsKt.translated(localizedString);
                    }
                    String str2 = str;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                    if (translated == null) {
                        translated = "";
                    }
                    ViewfinderKt.HeroHeader(translated, fillMaxWidth, str2, (TextStyle) null, gapComposer2, 0, 8);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
