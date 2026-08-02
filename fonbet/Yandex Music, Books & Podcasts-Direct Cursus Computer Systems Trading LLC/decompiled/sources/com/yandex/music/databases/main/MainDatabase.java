package com.yandex.music.databases.main;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bok;
import defpackage.ce1;
import defpackage.clc;
import defpackage.cw;
import defpackage.f4m;
import defpackage.flm;
import defpackage.g4m;
import defpackage.h2t;
import defpackage.hjn;
import defpackage.j20;
import defpackage.jk1;
import defpackage.lm1;
import defpackage.mnp;
import defpackage.msa;
import defpackage.mys;
import defpackage.n3u;
import defpackage.nsa;
import defpackage.o4h;
import defpackage.pw4;
import defpackage.q1m;
import defpackage.q4g;
import defpackage.r4m;
import defpackage.s9u;
import defpackage.ssa;
import defpackage.swl;
import defpackage.tdh;
import defpackage.u2u;
import defpackage.u75;
import defpackage.ueo;
import defpackage.uop;
import defpackage.uxs;
import defpackage.v3t;
import defpackage.wop;
import defpackage.yd5;
import defpackage.ydh;
import defpackage.yq;
import defpackage.z20;
import defpackage.zkm;
import defpackage.zsd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/music/databases/main/MainDatabase;", "Lueo;", "<init>", "()V", "shared-integration-databases"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public abstract class MainDatabase extends ueo {
    public static final long o;
    public static final /* synthetic */ int p = 0;
    public final AtomicReference n = new AtomicReference();

    static {
        msa msaVar = nsa.b;
        o = yd5.M(60, ssa.SECONDS);
    }

    public abstract jk1 A();

    public abstract lm1 B();

    public abstract pw4 C();

    public abstract q4g D();

    public abstract o4h E();

    public final void F(String... strArr) {
        ((ydh) this.n.get()).a((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final clc G(String[] strArr, Function1 function1) {
        Object obj;
        ArrayList<String> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : strArr) {
            str.getClass();
            if (str.equals("track_mview") || str.equals("playlist_mview") || str.equals("album_mview") || str.equals("artist_mview")) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        ydh ydhVar = (ydh) this.n.get();
        ydhVar.getClass();
        mnp mnpVar = new mnp();
        for (String str2 : arrayList) {
            str2.getClass();
            Iterator it = u75.h(ydhVar.a, ydhVar.b, ydhVar.c, ydhVar.d).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((tdh) obj).a.equals(str2)) {
                    break;
                }
            }
            tdh tdhVar = (tdh) obj;
            if (tdhVar != null) {
                mnpVar.addAll(tdhVar.c);
            }
        }
        mnpVar.remove("tracks_cache_mirror");
        String[] strArr2 = (String[]) wop.i(CollectionsKt.A0(arrayList2), uop.a(mnpVar)).toArray(new String[0]);
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        return new clc(zsd.C(i().a((String[]) Arrays.copyOf(strArr3, strArr3.length)), -1), function1);
    }

    public abstract bok H();

    public abstract r4m I();

    public final swl J() {
        Object obj = this.n.get();
        obj.getClass();
        return new swl(this, (ydh) obj);
    }

    public abstract q1m K();

    public abstract g4m L();

    public final f4m M() {
        return new f4m(L());
    }

    public abstract zkm N();

    public abstract flm O();

    public abstract hjn P();

    public final uxs Q() {
        Object obj = this.n.get();
        obj.getClass();
        return new uxs(this, (ydh) obj);
    }

    public abstract mys R();

    public abstract h2t S();

    public abstract v3t T();

    public abstract u2u U();

    public abstract n3u V();

    public abstract s9u W();

    public abstract yq v();

    public final cw w() {
        Object obj = this.n.get();
        obj.getClass();
        return new cw(this, (ydh) obj);
    }

    public abstract j20 x();

    public abstract z20 y();

    public final ce1 z() {
        Object obj = this.n.get();
        obj.getClass();
        return new ce1(this, (ydh) obj);
    }
}
