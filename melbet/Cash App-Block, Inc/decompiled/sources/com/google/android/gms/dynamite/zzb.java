package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountViewModel;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.limits.viewmodels.LimitViewModel;
import com.squareup.cash.limits.viewmodels.LimitsSectionType;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda5;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import com.squareup.protos.franklin.ui.Avatar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.intellij.markdown.parser.sequentialparsers.DelimiterParser$Info;

/* loaded from: classes6.dex */
public abstract class zzb {
    public static ClassLoader zza;
    public static Thread zzb;

    public static final void DynamicGroupingLimitList(int i, Composer composer, Modifier modifier, List list, Function1 function1) {
        Modifier modifier2;
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1534240816);
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i | 48 | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(559554485);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LimitViewModel limitViewModel = (LimitViewModel) it.next();
                String str = limitViewModel.title;
                if (str == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Cash Limits Group title should not be null");
                    return;
                }
                LimitsSectionType limitsSectionType = limitViewModel.sectionType;
                boolean changedInstance = ((i2 & 896) == 256) | gapComposer.changedInstance(limitViewModel);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new IntentLauncher$$ExternalSyntheticLambda0(23, function1, limitViewModel);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                DynamicGroupingLimitsListItem(str, limitsSectionType, (Function0) rememberedValue, gapComposer, 0);
            }
            gapComposer.end(false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InfoSectionKt$$ExternalSyntheticLambda5(list, modifier2, function1, i, 3);
        }
    }

    public static final void DynamicGroupingLimitsListItem(String str, LimitsSectionType limitsSectionType, Function0 function0, Composer composer, int i) {
        str.getClass();
        limitsSectionType.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(584720956);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(limitsSectionType.ordinal()) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(1099903402, new CashMapViewKt$$ExternalSyntheticLambda5(limitsSectionType, 14), gapComposer), Expect_jvmKt.rememberComposableLambda(-1002550101, new PoolCreateViewKt$$ExternalSyntheticLambda5(str, 8), gapComposer), null, function0, false, false, null, null, CellDefaultAccessory.Push.INSTANCE, 0L, gapComposer, ((i2 << 3) & 7168) | 805306422, 3572);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(str, limitsSectionType, function0, false, i, 21);
        }
    }

    public static boolean areAdjacentSameMarkers(ArrayList arrayList, int i, int i2) {
        DelimiterParser$Info delimiterParser$Info = (DelimiterParser$Info) arrayList.get(i);
        DelimiterParser$Info delimiterParser$Info2 = (DelimiterParser$Info) arrayList.get(i2);
        if (i <= 0) {
            return false;
        }
        int i3 = i - 1;
        return ((DelimiterParser$Info) arrayList.get(i3)).closerIndex == delimiterParser$Info.closerIndex + 1 && ((DelimiterParser$Info) arrayList.get(i3)).marker == delimiterParser$Info.marker && ((DelimiterParser$Info) arrayList.get(i3)).position == delimiterParser$Info.position - 1 && ((DelimiterParser$Info) arrayList.get(delimiterParser$Info.closerIndex + 1)).position == delimiterParser$Info2.position + 1;
    }

    public static final AccountViewModel toAccountViewModel(FullAccount fullAccount, String str) {
        fullAccount.getClass();
        String str2 = fullAccount.account_id;
        str2.getClass();
        String str3 = fullAccount.title;
        str3.getClass();
        String str4 = fullAccount.cash_tag;
        str4.getClass();
        Avatar avatar = fullAccount.avatar;
        avatar.getClass();
        StackedAvatarViewModel.Single viewModel = StackedAvatarViewModelKt.toViewModel(avatar);
        Boolean bool = fullAccount.is_business;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        str2.getClass();
        return new AccountViewModel(str2, str3, str4, viewModel, booleanValue, str2.equals(str), fullAccount.business_category);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b0, code lost:
    
        if (r2 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader zza() {
        ClassLoader classLoader;
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        synchronized (zzb.class) {
            if (zza == null) {
                Thread thread2 = zzb;
                ClassLoader classLoader2 = null;
                if (thread2 == null) {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread2 = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                try {
                                    int activeGroupCount = threadGroup2.activeGroupCount();
                                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                                    threadGroup2.enumerate(threadGroupArr);
                                    int i = 0;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= activeGroupCount) {
                                            threadGroup = null;
                                            break;
                                        }
                                        threadGroup = threadGroupArr[i2];
                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                            break;
                                        }
                                        i2++;
                                    }
                                    if (threadGroup == null) {
                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                    }
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[activeCount];
                                    threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i >= activeCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i++;
                                    }
                                    if (thread == null) {
                                        try {
                                            zza zzaVar = new zza(threadGroup, "GmsDynamite");
                                            try {
                                                zzaVar.setContextClassLoader(null);
                                                zzaVar.start();
                                                thread = zzaVar;
                                            } catch (SecurityException e2) {
                                                e = e2;
                                                thread = zzaVar;
                                                String message = e.getMessage();
                                                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 39);
                                                sb.append("Failed to enumerate thread/threadgroup ");
                                                sb.append(message);
                                                Log.w("DynamiteLoaderV2CL", sb.toString());
                                                thread2 = thread;
                                                zzb = thread2;
                                            }
                                        } catch (SecurityException e3) {
                                            e = e3;
                                        }
                                    }
                                } finally {
                                }
                            } catch (SecurityException e4) {
                                e = e4;
                                thread = null;
                            }
                        }
                        thread2 = thread;
                    }
                    zzb = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = zzb.getContextClassLoader();
                    } catch (SecurityException e5) {
                        String message2 = e5.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 41);
                        sb2.append("Failed to get thread context classloader ");
                        sb2.append(message2);
                        Log.w("DynamiteLoaderV2CL", sb2.toString());
                    }
                }
                zza = classLoader2;
            }
            classLoader = zza;
        }
        return classLoader;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
    }

    public void onAuthenticationFailed() {
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
    }
}
