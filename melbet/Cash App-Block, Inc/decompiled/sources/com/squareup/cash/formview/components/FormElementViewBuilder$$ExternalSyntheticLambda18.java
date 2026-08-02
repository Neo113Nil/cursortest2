package com.squareup.cash.formview.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacg;
import com.squareup.cash.formview.components.arcade.ArcadeFormHeroNumericsKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.cash.StringsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import squareup.cash.ui.arcade.elements.HeroNumericsHeader;
import squareup.cash.ui.arcade.elements.HorizontalAlignment;

/* loaded from: classes5.dex */
public final /* synthetic */ class FormElementViewBuilder$$ExternalSyntheticLambda18 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FormBlocker.Element.HeroNumericsHeaderElement f$0;

    public /* synthetic */ FormElementViewBuilder$$ExternalSyntheticLambda18(FormBlocker.Element.HeroNumericsHeaderElement heroNumericsHeaderElement, int i) {
        this.$r8$classId = i;
        this.f$0 = heroNumericsHeaderElement;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        LocalizedString localizedString;
        HeroNumericsHeader.BodyText bodyText;
        LocalizedString localizedString2;
        LocalizedString localizedString3;
        LocalizedString localizedString4;
        int i = this.$r8$classId;
        FormBlocker.Element.HeroNumericsHeaderElement heroNumericsHeaderElement = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    ArcadeFormHeroNumericsKt.ArcadeFormHeroNumerics(heroNumericsHeaderElement, null, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    HeroNumericsHeader heroNumericsHeader = heroNumericsHeaderElement.header;
                    String translated = (heroNumericsHeader == null || (localizedString4 = heroNumericsHeader.title_text) == null) ? null : StringsKt.translated(localizedString4);
                    if (translated == null) {
                        translated = "";
                    }
                    String str = translated;
                    String translated2 = (heroNumericsHeader == null || (localizedString3 = heroNumericsHeader.section_title_text) == null) ? null : StringsKt.translated(localizedString3);
                    String translated3 = (heroNumericsHeader == null || (bodyText = heroNumericsHeader.body_text) == null || (localizedString2 = bodyText.text) == null) ? null : StringsKt.translated(localizedString2);
                    String translated4 = (heroNumericsHeader == null || (localizedString = heroNumericsHeader.additional_body_text) == null) ? null : StringsKt.translated(localizedString);
                    HorizontalAlignment horizontalAlignment = heroNumericsHeader != null ? heroNumericsHeader.horizontal_alignment : null;
                    int i2 = horizontalAlignment == null ? -1 : ArcadeFormHeroNumericsKt.WhenMappings.$EnumSwitchMapping$0[horizontalAlignment.ordinal()];
                    int i3 = 3;
                    if (i2 != -1) {
                        if (i2 == 1) {
                            i3 = 5;
                        } else if (i2 == 2) {
                            i3 = 6;
                        }
                    }
                    zzacg.m2010HeroNumericsHeadertv5qRRQ(str, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), i3, translated2, (String) null, translated3, translated4, gapComposer2, 0, 16);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
