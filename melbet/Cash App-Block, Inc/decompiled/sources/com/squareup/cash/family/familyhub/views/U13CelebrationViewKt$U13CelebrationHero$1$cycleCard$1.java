package com.squareup.cash.family.familyhub.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class U13CelebrationViewKt$U13CelebrationHero$1$cycleCard$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Animatable L$1;
    public WalletMetrics L$2;
    public ParcelableSnapshotMutableIntState L$3;
    public Mutex L$4;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return AllowanceViewKt.access$U13CelebrationHero$lambda$29$cycleCard(null, null, null, null, this);
    }
}
