package com.squareup.cash.localization.views;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.util.DBUtil;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.google.pay.GooglePayPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.localization.viewmodels.LanguageDisclosureViewModel;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class LanguageDisclosureViewKt {
    static {
        new LanguageDisclosureViewModel.Content.Copy("EN", "Use Cash App in Spanish", "Cash App is available in Spanish, but some content may still appear in English. You can switch languages at any time by changing your device settings.", "Terms & conditions", "Block, Inc. (“Block”) is piloting a limited Spanish-language version of Cash App (“Cash App Spanish”), currently available only to Cash App employees for internal testing and employee feedback purposes.\n\nBy using Cash App Spanish, you acknowledge and agree that it: (i) is an employee pilot not available to the general public and provided only for testing and feedback purposes; (ii) may vary from and/or have more limited functionality, availability, and content than the English version; (iii) offers limited or no customer support in Spanish and certain products (including, without limitation, Investing and Taxes), correspondences, agreements, terms, disclosures, and/or functionalities may only be available in English; (iv) is provided “as is” and “as available,” without warranties of any kind, whether express or implied, to the extent permitted by law; and (v) may use generative AI or AI translation assistance for Spanish-language translations, which may contain errors or inaccuracies and no guarantee is made as to the accuracy or completeness of the translation.\n\nYou further understand, acknowledge, and agree that: (i) Block may modify, suspend, or discontinue Cash App Spanish in part or in its entirety at any time, with or without notice; (ii) the English version of Cash App and the English version of all agreements, terms, and disclosures govern your Cash App account; and (iii) you have read and understood the English language agreements, terms, and disclosures governing your Cash App account.\n\nEnglish-Only Products\n\nCertain Cash App and Afterpay products are only available in English at this time (each, an “English-Only Product”). By using an English-Only Product, you understand, acknowledge, and agree that Block, Inc. and any applicable subsidiaries or third-party partners do not offer the English-Only Product in Spanish at this time. You further understand, acknowledge, and agree that all language documents, legal agreements, disclaimers, correspondence, and/or other services or functionalities are only available in English. To use the English version of Cash App, change your mobile device’s language settings to English.\n\nDue to the limitations set out above, you should consider whether Cash App Spanish is appropriate for your use. To use the English version of Cash App, change your mobile device’s language settings to English.", "By continuing, you agree to these terms", "Continue");
        new LanguageDisclosureViewModel.Content.Copy("ES", "Usar Cash App en español", "Cash App está disponible en español, pero es posible que algunos contenidos sigan apareciendo en inglés. Puedes cambiar de idioma en cualquier momento cambiando la configuración de tu dispositivo.", "Términos y condiciones", "Block, Inc. (“Block”) está probando una versión limitada en español de Cash App (“Cash App en español”), actualmente disponible solo para los empleados de Cash App con el fin de realizar pruebas internas y obtener la opinión de los empleados.\n\nAl usar Cash App en español, usted reconoce y acepta que: (i) se trata de una versión piloto para empleados que no está disponible para el público en general y que se ofrece únicamente con fines de prueba y para obtener la opinión de los empleados; (ii) puede variar o tener una funcionalidad, disponibilidad y contenido limitados en relación con la versión en inglés; (iii) la atención al cliente en español es limitada o inexistente, y determinados productos (incluidos, entre otros, Inversiones e Impuestos), correspondencias, acuerdos, condiciones, avisos legales y/o funcionalidades pueden estar disponibles solo en inglés; (iv) se proporciona “tal cual” y “según esté disponible”, sin garantías de ningún tipo, ya sean expresas o implícitas, en la medida permitida por la ley; y (v) puede usar IA generativa o asistencia de traducción de IA para traducciones en español, que pueden contener errores o inexactitudes y no se garantiza la precisión o integridad de la traducción.\n\nAdemás, comprende, reconoce y acepta que: (i) Block puede modificar, suspender o descontinuar Cash App en español en parte o en su totalidad en cualquier momento, con o sin previo aviso; (ii) la versión en inglés de Cash App y la versión en inglés de todos los acuerdos, condiciones y avisos legales rigen su cuenta de Cash App; y (iii) usted leyó y comprende los acuerdos, condiciones y avisos legales en inglés que rigen su cuenta de Cash App.\n\nProductos únicamente disponibles en inglés\n\nActualmente, ciertos productos de Cash App y Afterpay solo están disponibles en inglés (cada uno de ellos, un “Producto solo en inglés”). Al usar un Producto solo en inglés, usted comprende, reconoce y acepta que Block, Inc. y cualquier subsidiaria o socio externo pertinente no ofrecen el Producto solo en inglés en el idioma español en este momento. Además, comprende, reconoce y acepta que todos los documentos, acuerdos legales, descargos de responsabilidad, correspondencias y/u otros servicios o funcionalidades están disponibles únicamente en inglés. Para usar la versión en inglés de Cash App, cambie la configuración de idioma de su dispositivo móvil a inglés.\n\nDebido a las limitaciones establecidas anteriormente, debe considerar si Cash App en español se ajusta a sus necesidades. Para usar la versión en inglés de Cash App, cambie la configuración de idioma de su dispositivo móvil a inglés.", "Al continuar, acepta estas condiciones", "Continuar");
    }

    public static final void LanguageDisclosureView(LanguageDisclosureViewModel languageDisclosureViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        LanguageDisclosureViewModel languageDisclosureViewModel2;
        languageDisclosureViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(97415169);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(languageDisclosureViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            languageDisclosureViewModel2 = languageDisclosureViewModel;
            Strings.LoadableFullScreenContent(languageDisclosureViewModel2, languageDisclosureViewModel instanceof LanguageDisclosureViewModel.Loading, null, null, null, Expect_jvmKt.rememberComposableLambda(991477892, new HeroCardViewKt$$ExternalSyntheticLambda1(function1, z, i3), gapComposer), gapComposer, (i2 & 14) | 196608, 28);
        } else {
            languageDisclosureViewModel2 = languageDisclosureViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(languageDisclosureViewModel2, function1, i, 28);
        }
    }

    public static final void LanguageDisclosureViewContent(LanguageDisclosureViewModel.Content content, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        LanguageDisclosureViewModel.Content.Copy copy;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1117061858);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Language.English);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            int ordinal = ((Language) mutableState.getValue()).ordinal();
            if (ordinal == 0) {
                copy = content.englishCopy;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                copy = content.spanishCopy;
            }
            Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
            boolean changed = gapComposer2.changed(((Language) mutableState.getValue()).ordinal());
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                Configuration configuration = new Configuration();
                configuration.setLocale(((Language) mutableState.getValue()).locale);
                rememberedValue2 = context.createConfigurationContext(configuration);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Context context2 = (Context) rememberedValue2;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (z || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CashMapViewKt$$ExternalSyntheticLambda4(8, function1);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue3, gapComposer2, 0, 1);
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1497560397, new CashMapViewKt$$ExternalSyntheticLambda15(7, context2, copy, content, mutableState, function1), gapComposer2), gapComposer, 3072, 7);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(content, function1, i, 29);
        }
    }
}
