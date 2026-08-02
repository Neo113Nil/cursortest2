package com.squareup.cash;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Looper;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.limits.presenters.LimitsViewModelExtensionsKt$WhenMappings;
import com.squareup.cash.limits.screens.LimitsCategoryData;
import com.squareup.cash.limits.screens.LimitsCategoryType;
import com.squareup.cash.limits.screens.LimitsSectionData;
import com.squareup.cash.limits.screens.LimitsSectionIconData;
import com.squareup.cash.limits.screens.ProgressBarData;
import com.squareup.cash.limits.screens.ProgressType;
import com.squareup.cash.limits.viewmodels.LimitItemViewModel;
import com.squareup.cash.limits.viewmodels.LimitViewModel;
import com.squareup.cash.limits.viewmodels.LimitsCategoryViewModel$LimitsCategory;
import com.squareup.cash.limits.viewmodels.LimitsSectionType;
import com.squareup.cash.limits.viewmodels.ProgressViewModel;
import com.squareup.protos.cash.ui.Color;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.internal.Factory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;

/* loaded from: classes5.dex */
public abstract class NavigationModule$Companion {
    public static AudioManager audioManager;

    /* loaded from: classes.dex */
    public final class ProvideLastTransferTimeMetroFactory implements Factory {
        public static final ProvideLastTransferTimeMetroFactory INSTANCE = new ProvideLastTransferTimeMetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NavigationModule$Companion.provideLastTransferTime();
        }
    }

    public static synchronized AudioManager getAudioManager(Context context) {
        synchronized (NavigationModule$Companion.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    audioManager = null;
                }
                AudioManager audioManager2 = audioManager;
                if (audioManager2 != null) {
                    return audioManager2;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    ConditionVariable conditionVariable = new ConditionVariable();
                    Log.get().execute(new DispatchQueue$$ExternalSyntheticLambda0(11, applicationContext, conditionVariable));
                    conditionVariable.blockUninterruptible();
                    AudioManager audioManager3 = audioManager;
                    audioManager3.getClass();
                    return audioManager3;
                }
                AudioManager audioManager4 = (AudioManager) applicationContext.getSystemService("audio");
                audioManager = audioManager4;
                audioManager4.getClass();
                return audioManager4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static List getClipDataUris$activity(Intent intent) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data = intent.getData();
        if (data != null) {
            linkedHashSet.add(data);
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null && linkedHashSet.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        if (clipData != null) {
            int itemCount = clipData.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                Uri uri = clipData.getItemAt(i).getUri();
                if (uri != null) {
                    linkedHashSet.add(uri);
                }
            }
        }
        return new ArrayList(linkedHashSet);
    }

    public static int passWhiteSpaces(int i, CharSequence charSequence) {
        while (i < charSequence.length() && (charSequence.charAt(i) == ' ' || charSequence.charAt(i) == '\t')) {
            i++;
        }
        return i;
    }

    public static AtomicLong provideLastTransferTime() {
        return new AtomicLong(0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LimitsSectionData toSectionData(LimitViewModel limitViewModel) {
        LimitsSectionIconData limitsSectionIconData;
        Iterator it;
        String str;
        ArrayList arrayList;
        LimitsCategoryData limitsCategoryData;
        Iterator it2;
        String str2;
        ProgressBarData progressBarData;
        Color color;
        Color color2;
        ArrayList arrayList2;
        Color color3;
        Color color4;
        limitViewModel.getClass();
        ColorModel colorModel = limitViewModel.accentColor;
        ArrayList arrayList3 = null;
        ColorModel.Accented accented = colorModel instanceof ColorModel.Accented ? (ColorModel.Accented) colorModel : null;
        String color5 = (accented == null || (color4 = accented.color) == null) ? null : color4.toString();
        String str3 = limitViewModel.title;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3;
        LimitsSectionType limitsSectionType = limitViewModel.sectionType;
        switch (limitsSectionType == null ? -1 : LimitsViewModelExtensionsKt$WhenMappings.$EnumSwitchMapping$0[limitsSectionType.ordinal()]) {
            case 1:
                limitsSectionIconData = LimitsSectionIconData.SEND_AND_RECEIVE;
                break;
            case 2:
                limitsSectionIconData = LimitsSectionIconData.DEPOSIT_AND_WITHDRAW;
                break;
            case 3:
                limitsSectionIconData = LimitsSectionIconData.CASH_CARD;
                break;
            case 4:
                limitsSectionIconData = LimitsSectionIconData.BITCOIN;
                break;
            case 5:
                limitsSectionIconData = LimitsSectionIconData.STOCKS;
                break;
            case 6:
                limitsSectionIconData = LimitsSectionIconData.UNKNOWN;
                break;
            default:
                limitsSectionIconData = LimitsSectionIconData.UNKNOWN;
                break;
        }
        LimitsSectionIconData limitsSectionIconData2 = limitsSectionIconData;
        List list = limitViewModel.categories;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof LimitsCategoryViewModel$LimitsCategory) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            LimitsCategoryViewModel$LimitsCategory limitsCategoryViewModel$LimitsCategory = (LimitsCategoryViewModel$LimitsCategory) it3.next();
            limitsCategoryViewModel$LimitsCategory.getClass();
            List list2 = limitsCategoryViewModel$LimitsCategory.limits;
            String str5 = limitsCategoryViewModel$LimitsCategory.categoryHeader;
            List<LimitItemViewModel> list3 = list2;
            int i = 10;
            ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            for (LimitItemViewModel limitItemViewModel : list3) {
                if (limitItemViewModel instanceof LimitItemViewModel.StaticLimit) {
                    limitsCategoryData = new LimitsCategoryData(LimitsCategoryType.LEGACY, str5 == null ? ((LimitItemViewModel.StaticLimit) limitItemViewModel).header : str5, ((LimitItemViewModel.StaticLimit) limitItemViewModel).items, arrayList3);
                    ArrayList arrayList7 = arrayList3;
                    str = str5;
                    arrayList = arrayList7;
                    it = it3;
                } else {
                    if (!(limitItemViewModel instanceof LimitItemViewModel.ProgressBarLimit)) {
                        LimitsSectionData limitsSectionData = arrayList3;
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return limitsSectionData;
                    }
                    LimitsCategoryType limitsCategoryType = LimitsCategoryType.PROGRESSIVE;
                    String str6 = str5 == null ? ((LimitItemViewModel.ProgressBarLimit) limitItemViewModel).header : str5;
                    List<ProgressViewModel> list4 = ((LimitItemViewModel.ProgressBarLimit) limitItemViewModel).progressBars;
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, i));
                    for (ProgressViewModel progressViewModel : list4) {
                        if (progressViewModel instanceof ProgressViewModel.SimpleProgress) {
                            ProgressViewModel.SimpleProgress simpleProgress = (ProgressViewModel.SimpleProgress) progressViewModel;
                            String str7 = simpleProgress.primaryText;
                            ArrayList arrayList9 = arrayList3;
                            String str8 = simpleProgress.secondaryText;
                            it2 = it3;
                            Double d = simpleProgress.progress;
                            ColorModel colorModel2 = simpleProgress.color;
                            ColorModel.Accented accented2 = colorModel2 instanceof ColorModel.Accented ? (ColorModel.Accented) colorModel2 : arrayList9;
                            progressBarData = new ProgressBarData(str7, str8, d, (accented2 == null || (color3 = accented2.color) == null) ? arrayList9 : color3.toString(), ProgressType.SIMPLE, null, null, null, null, null);
                            str2 = str5;
                            arrayList2 = arrayList9;
                        } else {
                            it2 = it3;
                            LimitsSectionData limitsSectionData2 = arrayList3;
                            if (progressViewModel instanceof ProgressViewModel.MoneyProgress) {
                                ProgressViewModel.MoneyProgress moneyProgress = (ProgressViewModel.MoneyProgress) progressViewModel;
                                String str9 = moneyProgress.limitThresholdAmount;
                                str2 = str5;
                                double d2 = moneyProgress.consumedProportion;
                                String str10 = moneyProgress.limitThresholdText;
                                Double valueOf = Double.valueOf(d2);
                                ColorModel colorModel3 = moneyProgress.color;
                                ColorModel.Accented accented3 = colorModel3 instanceof ColorModel.Accented ? (ColorModel.Accented) colorModel3 : limitsSectionData2;
                                progressBarData = new ProgressBarData(str10, str9, valueOf, (accented3 == null || (color2 = accented3.color) == null) ? limitsSectionData2 : color2.toString(), ProgressType.MONEY, moneyProgress.header, moneyProgress.amountUsed, moneyProgress.amountRemaining, str9, Double.valueOf(d2));
                                arrayList2 = limitsSectionData2;
                            } else {
                                str2 = str5;
                                if (!(progressViewModel instanceof ProgressViewModel.CountProgress)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return limitsSectionData2;
                                }
                                ProgressViewModel.CountProgress countProgress = (ProgressViewModel.CountProgress) progressViewModel;
                                double d3 = countProgress.consumedProportion;
                                String str11 = countProgress.limitThresholdText;
                                String str12 = countProgress.limitThresholdCount;
                                Double valueOf2 = Double.valueOf(d3);
                                ColorModel colorModel4 = countProgress.color;
                                ColorModel.Accented accented4 = colorModel4 instanceof ColorModel.Accented ? (ColorModel.Accented) colorModel4 : limitsSectionData2;
                                progressBarData = new ProgressBarData(str11, str12, valueOf2, (accented4 == null || (color = accented4.color) == null) ? limitsSectionData2 : color.toString(), ProgressType.COUNT, countProgress.header, countProgress.countUsed, countProgress.countRemaining, countProgress.limitThresholdCount, Double.valueOf(d3));
                                arrayList2 = limitsSectionData2;
                            }
                        }
                        arrayList8.add(progressBarData);
                        str5 = str2;
                        arrayList3 = arrayList2;
                        it3 = it2;
                    }
                    it = it3;
                    ArrayList arrayList10 = arrayList3;
                    str = str5;
                    arrayList = arrayList10;
                    limitsCategoryData = new LimitsCategoryData(limitsCategoryType, str6, arrayList, arrayList8);
                }
                arrayList6.add(limitsCategoryData);
                String str13 = str;
                arrayList3 = arrayList;
                str5 = str13;
                it3 = it;
                i = 10;
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList6, arrayList5);
        }
        return new LimitsSectionData(str4, limitsSectionIconData2, arrayList5, color5, limitViewModel.description);
    }
}
