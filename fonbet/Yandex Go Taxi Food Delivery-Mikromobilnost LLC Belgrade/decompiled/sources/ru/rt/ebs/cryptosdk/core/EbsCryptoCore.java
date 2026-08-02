package ru.rt.ebs.cryptosdk.core;

import android.content.Context;
import defpackage.an8;
import defpackage.boj0;
import defpackage.bri0;
import defpackage.c7q0;
import defpackage.eju0;
import defpackage.f831;
import defpackage.gx50;
import defpackage.ht10;
import defpackage.hwo0;
import defpackage.j920;
import defpackage.j9e;
import defpackage.kcz0;
import defpackage.kpe;
import defpackage.lpe;
import defpackage.mpe;
import defpackage.n4w;
import defpackage.o021;
import defpackage.obo;
import defpackage.ojn;
import defpackage.q4g;
import defpackage.qoc;
import defpackage.s421;
import defpackage.w3i;
import defpackage.wp50;
import defpackage.wrr;
import defpackage.wwv;
import defpackage.x70;
import defpackage.xv10;
import defpackage.z831;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.common.entities.models.IEbsCryptoSdkConfig;
import ru.rt.ebs.cryptosdk.core.common.entities.models.IProdEbsCryptoSdkConfig;
import ru.rt.ebs.cryptosdk.core.di.ICoreComponent;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0005¨\u0006\f"}, d2 = {"Lru/rt/ebs/cryptosdk/core/EbsCryptoCore;", "", "<init>", "()V", "createCoreComponent", "Lru/rt/ebs/cryptosdk/core/di/ICoreComponent;", "context", "Landroid/content/Context;", "prodEbsCryptoSdkConfig", "Lru/rt/ebs/cryptosdk/core/common/entities/models/IProdEbsCryptoSdkConfig;", "ebsCryptoSdkConfig", "Lru/rt/ebs/cryptosdk/core/common/entities/models/IEbsCryptoSdkConfig;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class EbsCryptoCore {
    public final ICoreComponent createCoreComponent(Context context, IProdEbsCryptoSdkConfig prodEbsCryptoSdkConfig, IEbsCryptoSdkConfig ebsCryptoSdkConfig) {
        new lpe();
        mpe mpeVar = new mpe(prodEbsCryptoSdkConfig, ebsCryptoSdkConfig);
        an8 an8Var = new an8(new qoc(), mpeVar, context);
        hwo0 hwo0Var = new hwo0(new eju0(), an8Var);
        ht10 ht10Var = new ht10(new j920(), an8Var, 3);
        hwo0 hwo0Var2 = new hwo0(new c7q0(), mpeVar, hwo0Var, an8Var);
        boj0 boj0Var = new boj0(new gx50(), hwo0Var2, an8Var, mpeVar);
        xv10 xv10Var = new xv10(new bri0(), hwo0Var, boj0Var, ht10Var, mpeVar);
        wrr wrrVar = new wrr(new wwv(), an8Var, hwo0Var, hwo0Var2, xv10Var, ht10Var, mpeVar);
        q4g q4gVar = new q4g((Object) new n4w(), boj0Var, hwo0Var, an8Var, mpeVar, 22);
        s421 s421Var = new s421(new z831(), hwo0Var, an8Var, mpeVar);
        boj0 boj0Var2 = new boj0(new x70(), hwo0Var, boj0Var, s421Var, an8Var, mpeVar);
        q4g q4gVar2 = new q4g((Object) new obo(), boj0Var, hwo0Var, an8Var, mpeVar, 17);
        w3i w3iVar = new w3i(new ojn(), boj0Var, hwo0Var, ht10Var, q4gVar, boj0Var2, an8Var, s421Var, mpeVar);
        an8 an8Var2 = new an8(new j9e(), boj0Var, s421Var, an8Var);
        o021 o021Var = new o021(s421Var, wrrVar, hwo0Var2, q4gVar, boj0Var2, w3iVar, an8Var2, ht10Var, an8Var);
        new f831();
        kcz0 kcz0Var = new kcz0();
        kcz0Var.a = o021Var;
        return new kpe(an8Var, ht10Var, hwo0Var, boj0Var, xv10Var, hwo0Var2, wrrVar, q4gVar, boj0Var2, q4gVar2, w3iVar, an8Var2, s421Var, kcz0Var, o021Var, new ht10(new wp50(), boj0Var, 15));
    }
}
