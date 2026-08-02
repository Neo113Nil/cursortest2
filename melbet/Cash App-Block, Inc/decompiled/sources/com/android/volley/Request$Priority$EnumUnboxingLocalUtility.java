package com.android.volley;

import android.os.Parcel;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.unit.Dp;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.google.mlkit.common.internal.zzc;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.treehouse.platform.CashTreehouseAppFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.InteractionResult;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class Request$Priority$EnumUnboxingLocalUtility {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(CashTreehouseAppFactory.LauncherEventListenerFactory launcherEventListenerFactory) {
        boolean isTerminated;
        if (launcherEventListenerFactory instanceof AutoCloseable) {
            launcherEventListenerFactory.close();
            return;
        }
        if (!(launcherEventListenerFactory instanceof ExecutorService)) {
            Path$$ExternalSyntheticBUOutline0.m$3();
            return;
        }
        ExecutorService executorService = (ExecutorService) launcherEventListenerFactory;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void m$1(zzc zzcVar, Modifier.Companion companion, float f, GapComposer gapComposer) {
        zzcVar.getClass();
        SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, f));
    }

    public static LayoutWeightElement m(GapComposer gapComposer, Modifier modifier, ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1, float f, boolean z) {
        Updater.m576setimpl(gapComposer, modifier, composeUiNode$Companion$SetModifier$1);
        return new LayoutWeightElement(f, z);
    }

    public static Modifier m(float f, Modifier modifier, long j, float f2) {
        return SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(modifier, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(f)), f2);
    }

    public static Modifier m(float f, Modifier modifier, boolean z) {
        return modifier.then(new LayoutWeightElement(f, z));
    }

    public static Modifier m(BiasAlignment.Horizontal horizontal, Modifier modifier) {
        return modifier.then(new HorizontalAlignElement(horizontal));
    }

    public static Modifier m(Modifier.Companion companion, float f, GapComposer gapComposer, Modifier.Companion companion2, float f2) {
        SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, f));
        return SizeKt.fillMaxWidth(companion2, f2);
    }

    public static Dp m(GapComposer gapComposer, boolean z, float f) {
        gapComposer.end(z);
        return new Dp(f);
    }

    public static Object m(GapComposer gapComposer, int i, boolean z, InteractionResult interactionResult) {
        gapComposer.startReplaceGroup(i);
        gapComposer.end(z);
        return interactionResult.getCurrentState();
    }

    public static String m(String str, String str2, String str3, String str4, boolean z) {
        return str + str2 + str3 + z + str4;
    }

    public static String m(String str, String str2, String str3, boolean z, boolean z2) {
        return str + z + str2 + z2 + str3;
    }

    public static String m(String str, String str2, ArrayList arrayList) {
        return str + arrayList + str2;
    }

    public static String m(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder m(String str, String str2, String str3, String str4, List list) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(list);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static StringBuilder m1540m(String str, String str2, String str3, String str4, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(z);
        sb.append(str4);
        return sb;
    }

    public static void m(int i, Composer composer, ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1, Composer composer2, OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1) {
        Updater.m576setimpl(composer, Integer.valueOf(i), composeUiNode$Companion$SetModifier$1);
        Updater.m575reconcileimpl(composer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
    }

    public static void m(Parcel parcel, int i, Long l) {
        parcel.writeInt(i);
        parcel.writeLong(l.longValue());
    }

    public static void m(GapComposer gapComposer, boolean z, Modifier.Companion companion, float f, GapComposer gapComposer2) {
        gapComposer.end(z);
        SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, f));
    }

    public static void m(AndroidStatement androidStatement, int i, String str, int i2, String str2) {
        androidStatement.getClass();
        androidStatement.bindString(i, str);
        androidStatement.bindString(i2, str2);
    }

    public static void m(zzc zzcVar, Modifier.Companion companion, float f, GapComposer gapComposer) {
        zzcVar.getClass();
        SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, f));
    }

    public static void m(DefaultSizes defaultSizes, Modifier.Companion companion, float f, GapComposer gapComposer) {
        defaultSizes.getClass();
        SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, f));
    }

    public static long m(long j, long j2, long j3, long j4) {
        return ((j * j2) + j3) * j4;
    }

    public static void m(Long l, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(l);
        sb.append(str3);
    }

    public static void m(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
    }

    public static void m(String str, String str2, List list) {
        str.getClass();
        str2.getClass();
        list.getClass();
    }

    public static void m(String str, ByteString byteString, ArrayList arrayList) {
        arrayList.add(str + byteString);
    }

    public static void m(StringBuilder sb, float f, String str, float f2, String str2) {
        sb.append(f);
        sb.append(str);
        sb.append(f2);
        sb.append(str2);
    }

    public static void m(StringBuilder sb, List list, String str, List list2, String str2) {
        sb.append(list);
        sb.append(str);
        sb.append(list2);
        sb.append(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(okhttp3.Response response) {
        boolean isTerminated;
        if (response instanceof AutoCloseable) {
            response.close();
            return;
        }
        if (!(response instanceof ExecutorService)) {
            Path$$ExternalSyntheticBUOutline0.m$3();
            return;
        }
        ExecutorService executorService = (ExecutorService) response;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
