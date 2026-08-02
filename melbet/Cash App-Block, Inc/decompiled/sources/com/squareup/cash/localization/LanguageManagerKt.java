package com.squareup.cash.localization;

import android.app.LocaleConfig;
import android.app.LocaleManager;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.core.os.BundleKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public abstract class LanguageManagerKt {
    public static JobScheduler forNamespace(JobScheduler jobScheduler) {
        JobScheduler forNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        forNamespace.getClass();
        return forNamespace;
    }

    public static AccessibilityNodeInfo.AccessibilityAction getActionScrollInDirection() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static void getBoundsInWindow(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence getContainerTitle(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static boolean isAccessibilityDataSensitive(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static void setAccessibilityDataSensitive(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static void setHandwritingGestures(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(CollectionsKt__CollectionsKt.listOf((Object[]) new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class}));
        editorInfo.setSupportedHandwritingGesturePreviews(ArraysKt___ArraysKt.toSet(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
    }

    public static final void updateLocaleConfig(RealLanguageManager realLanguageManager, Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            ((LocaleManager) context.getSystemService(LocaleManager.class)).setOverrideLocaleConfig(((Boolean) realLanguageManager.isSpanishEnabledForThisSession$delegate.getValue()).booleanValue() ? new LocaleConfig(new LocaleList(Locale.US, Locale.forLanguageTag("es-US"))) : null);
        }
    }

    public static final Context wrapContext(RealLanguageManager realLanguageManager, Context context) {
        realLanguageManager.getClass();
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        locales.getClass();
        if (!((Boolean) realLanguageManager.isSpanishEnabledForThisSession$delegate.getValue()).booleanValue()) {
            LanguageManagerKt$wrapContext$1 languageManagerKt$wrapContext$1 = LanguageManagerKt$wrapContext$1.INSTANCE;
            int size = locales.size();
            for (int i = 0; i < size; i++) {
                Locale locale = locales.get(i);
                locale.getClass();
                if (((Boolean) languageManagerKt$wrapContext$1.get(locale)).booleanValue()) {
                    ArrayList arrayList = new ArrayList();
                    int size2 = locales.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Locale locale2 = locales.get(i2);
                        locale2.getClass();
                        if (!BundleKt.isSpanish(locale2)) {
                            arrayList.add(locale2);
                        }
                    }
                    Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                    LocaleList localeList = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
                    Configuration configuration = new Configuration();
                    if (localeList.isEmpty()) {
                        localeList = new LocaleList(Locale.US);
                    }
                    configuration.setLocales(localeList);
                    Context createConfigurationContext = context.createConfigurationContext(configuration);
                    createConfigurationContext.getClass();
                    return createConfigurationContext;
                }
            }
        }
        return context;
    }
}
