package androidx.compose.material3;

import android.icu.text.DateFormat;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import java.time.DayOfWeek;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class DatePicker_jvmKt$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ DateFormat m(Object obj) {
        return (DateFormat) obj;
    }

    public static /* synthetic */ LocaleList m(Locale[] localeArr) {
        return new LocaleList(localeArr);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AccessibilityManager$AccessibilityServicesStateChangeListener m2948m(Object obj) {
        return (AccessibilityManager$AccessibilityServicesStateChangeListener) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AutofillManager m2949m(Object obj) {
        return (AutofillManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AutofillValue m2950m(Object obj) {
        return (AutofillValue) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ HandwritingGesture m2951m(Object obj) {
        return (HandwritingGesture) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ InsertGesture m2952m(Object obj) {
        return (InsertGesture) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ RemoveSpaceGesture m2953m(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ SelectGesture m2954m(Object obj) {
        return (SelectGesture) obj;
    }

    public static /* synthetic */ TextClassification.Request.Builder m(CharSequence charSequence, int i, int i2) {
        return new TextClassification.Request.Builder(charSequence, i, i2);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ TextClassification m2956m(Object obj) {
        return (TextClassification) obj;
    }

    public static /* synthetic */ TextClassificationContext.Builder m(String str, String str2) {
        return new TextClassificationContext.Builder(str, str2);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ TextClassificationManager m2957m(Object obj) {
        return (TextClassificationManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ TextClassifier m2958m(Object obj) {
        return (TextClassifier) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ TextSelection.Request.Builder m2959m(CharSequence charSequence, int i, int i2) {
        return new TextSelection.Request.Builder(charSequence, i, i2);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ TextSelection m2960m(Object obj) {
        return (TextSelection) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m2961m() {
        return TextClassificationManager.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ DayOfWeek m2962m(Object obj) {
        return (DayOfWeek) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ZoneId m2968m(Object obj) {
        return (ZoneId) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ DateTimeFormatter m2970m(Object obj) {
        return (DateTimeFormatter) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ TemporalAccessor m2975m(Object obj) {
        return (TemporalAccessor) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m2977m() {
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m2978m(Object obj) {
        return obj instanceof SelectGesture;
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return AutofillManager.class;
    }

    /* renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m2981m$1() {
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof InsertGesture;
    }

    public static /* synthetic */ void m$2() {
    }

    public static /* bridge */ /* synthetic */ boolean m$2(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    public static /* synthetic */ void m$3() {
    }

    public static /* bridge */ /* synthetic */ boolean m$3(Object obj) {
        return obj instanceof DeleteGesture;
    }
}
