package ru.yandex.video.m3.player.ui.debug.compose;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.platform.m;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.a16;
import defpackage.aii0;
import defpackage.an91;
import defpackage.awk0;
import defpackage.b64;
import defpackage.bgr0;
import defpackage.bmt0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.dmw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fj91;
import defpackage.g131;
import defpackage.gns0;
import defpackage.hzr;
import defpackage.ik2;
import defpackage.izr;
import defpackage.j3c;
import defpackage.jl40;
import defpackage.kk2;
import defpackage.l8v;
import defpackage.ldc;
import defpackage.ly3;
import defpackage.lzr;
import defpackage.m4m0;
import defpackage.mhl0;
import defpackage.moy0;
import defpackage.myn;
import defpackage.o4b1;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.qje;
import defpackage.qke;
import defpackage.r1b0;
import defpackage.rly0;
import defpackage.si6;
import defpackage.sls;
import defpackage.soy0;
import defpackage.sty0;
import defpackage.td5;
import defpackage.tls;
import defpackage.uo5;
import defpackage.v1c;
import defpackage.v2w;
import defpackage.vng;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.x72;
import defpackage.ymb1;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.player.ui.debug.model.SessionColor;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\n\u001a\u00020\t*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmhl0;", "", "vsid", "Ll8v;", "vsidBitmap", "Lru/yandex/video/m3/player/ui/debug/model/SessionColor;", "sessionColor", "Lf530;", "modifier", "Lzy11;", "QrCode", "(Lmhl0;Ljava/lang/String;Ll8v;Lru/yandex/video/m3/player/ui/debug/model/SessionColor;Lf530;Lfid;II)V", "Lldc;", "toColor", "(Lru/yandex/video/m3/player/ui/debug/model/SessionColor;)J", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class QrCodeKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SessionColor.values().length];
            try {
                iArr[SessionColor.GREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SessionColor.YELLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SessionColor.RED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SessionColor.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0127, code lost:
    
        if (defpackage.jl40.l(r14.Q(), java.lang.Integer.valueOf(r0)) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0205, code lost:
    
        if (r5 == defpackage.did.a) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QrCode(final mhl0 mhl0Var, final String str, final l8v l8vVar, final SessionColor sessionColor, f530 f530Var, fid fidVar, final int i, final int i2) {
        int i3;
        SessionColor sessionColor2;
        int i4;
        f530 f530Var2;
        f530 f530Var3;
        final f530 f530Var4;
        int i5;
        boolean z;
        boolean z2;
        Object obj;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(494046032);
        dmw0 dmw0Var = btsVar.a;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(mhl0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.e(l8vVar) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            sessionColor2 = sessionColor;
            i3 |= btsVar.k(sessionColor2) ? 2048 : 1024;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                f530Var2 = f530Var;
                i3 |= btsVar.k(f530Var2) ? 16384 : 8192;
                if ((i3 & 9363) == 9362 || !btsVar.E()) {
                    c530 c530Var = c530.a;
                    f530 f530Var5 = i4 != 0 ? c530Var : f530Var2;
                    if (Flags.INSTANCE.getPlayerDebugViewFlags(btsVar, 6).getShowQrCode()) {
                        f530 b = mhl0Var.b(mhl0Var.a(f530Var5, DebugViewKt.isLandscape(btsVar, 0) ? 0.2f : 0.25f, true), x4c.F);
                        btsVar.f0(733328855);
                        uo5 uo5Var = x4c.b;
                        si6 e = pi6.e(uo5Var, btsVar, 0);
                        btsVar.f0(-1323940314);
                        int S = cma1.S(btsVar);
                        r1b0 o = btsVar.o();
                        ohd.G1.getClass();
                        sls slsVar = d.b;
                        a h = e.h(b);
                        if (dmw0Var == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar.i0();
                        if (btsVar.S) {
                            btsVar.n(slsVar);
                        } else {
                            btsVar.r0();
                        }
                        wls wlsVar = d.f;
                        qje.W(btsVar, wlsVar, e);
                        wls wlsVar2 = d.e;
                        qje.W(btsVar, wlsVar2, o);
                        wls wlsVar3 = d.g;
                        if (btsVar.S) {
                            i5 = i3;
                        } else {
                            i5 = i3;
                        }
                        b64.z(S, btsVar, S, wlsVar3);
                        h.invoke(new gns0(btsVar), btsVar, 0);
                        btsVar.f0(2058660585);
                        final j3c j3cVar = (j3c) btsVar.m(j.e);
                        btsVar.f0(-1224613366);
                        if (l8vVar != null) {
                            IntrinsicSize intrinsicSize = IntrinsicSize.Min;
                            f530 b2 = m4m0.b(ymb1.l(fj91.c(fj91.d(c530Var, intrinsicSize), intrinsicSize), cyk0.c(16.0f)), ldc.b(toColor(sessionColor2), 0.5f, 0.0f, 0.0f, 0.0f, 14), qke.q);
                            btsVar.f0(733328855);
                            si6 e2 = pi6.e(uo5Var, btsVar, 0);
                            btsVar.f0(-1323940314);
                            int S2 = cma1.S(btsVar);
                            r1b0 o2 = btsVar.o();
                            a h2 = e.h(b2);
                            btsVar.i0();
                            if (btsVar.S) {
                                btsVar.n(slsVar);
                            } else {
                                btsVar.r0();
                            }
                            qje.W(btsVar, wlsVar, e2);
                            qje.W(btsVar, wlsVar2, o2);
                            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S2))) {
                                b64.z(S2, btsVar, S2, wlsVar3);
                            }
                            h2.invoke(new gns0(btsVar), btsVar, 0);
                            btsVar.f0(2058660585);
                            a16 a16Var = new a16(l8vVar);
                            f530 l = ymb1.l(an91.k(fj91.c(fj91.d(f530Var5, intrinsicSize), intrinsicSize), 4.0f), cyk0.c(16.0f));
                            btsVar.f0(-1934458708);
                            boolean e3 = ((i5 & 112) == 32) | btsVar.e(j3cVar);
                            Object Q = btsVar.Q();
                            if (!e3) {
                                obj = Q;
                            }
                            sls slsVar2 = new sls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.QrCodeKt$QrCode$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r5v3, types: [android.text.SpannableString] */
                                /* JADX WARN: Type inference failed for: r5v7, types: [android.text.SpannableString] */
                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m820invoke() {
                                    long j;
                                    if (str != null) {
                                        j3c j3cVar2 = j3cVar;
                                        String str2 = str;
                                        kk2 kk2Var = new kk2(6, str2, null);
                                        ClipboardManager a = ((x72) j3cVar2).a();
                                        List list = EmptyList.a;
                                        List list2 = kk2Var.c;
                                        if (!(list2 == null ? list : list2).isEmpty()) {
                                            ?? spannableString = new SpannableString(str2);
                                            myn mynVar = new myn();
                                            if (list2 != null) {
                                                list = list2;
                                            }
                                            int size = list.size();
                                            int i6 = 0;
                                            String str3 = spannableString;
                                            while (i6 < size) {
                                                ik2 ik2Var = (ik2) list.get(i6);
                                                bmt0 bmt0Var = (bmt0) ik2Var.a;
                                                int i7 = ik2Var.b;
                                                int i8 = ik2Var.c;
                                                mynVar.a.recycle();
                                                mynVar.a = Parcel.obtain();
                                                moy0 moy0Var = bmt0Var.a;
                                                long j2 = bmt0Var.l;
                                                long j3 = bmt0Var.h;
                                                int i9 = i6;
                                                long j4 = bmt0Var.b;
                                                String str4 = str3;
                                                long b3 = moy0Var.b();
                                                int i10 = size;
                                                List list3 = list;
                                                long j5 = ldc.m;
                                                if (ldc.c(b3, j5)) {
                                                    j = j4;
                                                } else {
                                                    mynVar.a((byte) 1);
                                                    j = j4;
                                                    mynVar.d(bmt0Var.a.b());
                                                }
                                                long j6 = sty0.c;
                                                long j7 = j;
                                                byte b4 = 2;
                                                if (!sty0.a(j7, j6)) {
                                                    mynVar.a((byte) 2);
                                                    mynVar.c(j7);
                                                }
                                                lzr lzrVar = bmt0Var.c;
                                                if (lzrVar != null) {
                                                    mynVar.a((byte) 3);
                                                    mynVar.a.writeInt(lzrVar.a);
                                                }
                                                hzr hzrVar = bmt0Var.d;
                                                if (hzrVar != null) {
                                                    int i11 = hzrVar.a;
                                                    mynVar.a((byte) 4);
                                                    mynVar.a((i11 != 0 && i11 == 1) ? (byte) 1 : (byte) 0);
                                                }
                                                izr izrVar = bmt0Var.e;
                                                if (izrVar != null) {
                                                    int i12 = izrVar.a;
                                                    mynVar.a((byte) 5);
                                                    if (i12 != 0) {
                                                        if (i12 == 65535) {
                                                            b4 = 1;
                                                        } else if (i12 != 1) {
                                                            if (i12 == 2) {
                                                                b4 = 3;
                                                            }
                                                        }
                                                        mynVar.a(b4);
                                                    }
                                                    b4 = 0;
                                                    mynVar.a(b4);
                                                }
                                                String str5 = bmt0Var.g;
                                                if (str5 != null) {
                                                    mynVar.a((byte) 6);
                                                    mynVar.a.writeString(str5);
                                                }
                                                if (!sty0.a(j3, j6)) {
                                                    mynVar.a((byte) 7);
                                                    mynVar.c(j3);
                                                }
                                                td5 td5Var = bmt0Var.i;
                                                if (td5Var != null) {
                                                    float f = td5Var.a;
                                                    mynVar.a((byte) 8);
                                                    mynVar.b(f);
                                                }
                                                soy0 soy0Var = bmt0Var.j;
                                                if (soy0Var != null) {
                                                    mynVar.a((byte) 9);
                                                    mynVar.b(soy0Var.a);
                                                    mynVar.b(soy0Var.b);
                                                }
                                                if (!ldc.c(j2, j5)) {
                                                    mynVar.a((byte) 10);
                                                    mynVar.d(j2);
                                                }
                                                rly0 rly0Var = bmt0Var.m;
                                                if (rly0Var != null) {
                                                    mynVar.a(PKIBody._KRP);
                                                    mynVar.a.writeInt(rly0Var.a);
                                                }
                                                bgr0 bgr0Var = bmt0Var.n;
                                                if (bgr0Var != null) {
                                                    mynVar.a((byte) 12);
                                                    mynVar.d(bgr0Var.a);
                                                    long j8 = bgr0Var.b;
                                                    mynVar.b(Float.intBitsToFloat((int) (j8 >> 32)));
                                                    mynVar.b(Float.intBitsToFloat((int) (j8 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                                                    mynVar.b(bgr0Var.c);
                                                }
                                                ?? r5 = str4;
                                                r5.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(mynVar.a.marshall(), 0)), i7, i8, 33);
                                                list = list3;
                                                i6 = i9 + 1;
                                                size = i10;
                                                str3 = r5;
                                            }
                                            str2 = str3;
                                        }
                                        a.setPrimaryClip(ClipData.newPlainText("plain text", str2));
                                    }
                                }

                                @Override // defpackage.sls
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m820invoke();
                                    return zy11.a;
                                }
                            };
                            btsVar.o0(slsVar2);
                            obj = slsVar2;
                            final sls slsVar3 = (sls) obj;
                            z2 = false;
                            btsVar.t(false);
                            final QrCodeKt$QrCode$1$1$2 qrCodeKt$QrCode$1$1$2 = new sls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.QrCodeKt$QrCode$1$1$2
                                @Override // defpackage.sls
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m821invoke();
                                    return zy11.a;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m821invoke() {
                                }
                            };
                            f530 a = b.a(l, m.b ? new tls() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1
                                final /* synthetic */ boolean $enabled$inlined = true;
                                final /* synthetic */ String $onClickLabel$inlined = null;
                                final /* synthetic */ awk0 $role$inlined = null;
                                final /* synthetic */ sls $onDoubleClick$inlined = null;
                                final /* synthetic */ String $onLongClickLabel$inlined = null;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // defpackage.tls
                                public final Object invoke(Object obj2) {
                                    v2w v2wVar = (v2w) obj2;
                                    v2wVar.getClass();
                                    g131 g131Var = v2wVar.a;
                                    g131Var.b(BackendConfig.Restrictions.ENABLED, Boolean.valueOf(this.$enabled$inlined));
                                    g131Var.b("onClickLabel", this.$onClickLabel$inlined);
                                    g131Var.b("role", this.$role$inlined);
                                    g131Var.b("onClick", sls.this);
                                    g131Var.b("onDoubleClick", this.$onDoubleClick$inlined);
                                    g131Var.b("onLongClick", slsVar3);
                                    g131Var.b("onLongClickLabel", this.$onLongClickLabel$inlined);
                                    return zy11.a;
                                }
                            } : m.a(), new v1c(false ? 1 : 0, slsVar3, qrCodeKt$QrCode$1$1$2));
                            f530Var3 = f530Var5;
                            z = true;
                            o4b1.b(a16Var, "", a, null, null, 0.0f, null, btsVar, 48, 120);
                            ly3.A(btsVar, false, true, false, false);
                        } else {
                            f530Var3 = f530Var5;
                            z = true;
                            z2 = false;
                        }
                        ly3.A(btsVar, z2, z2, z, z2);
                        btsVar.t(z2);
                    } else {
                        f530Var3 = f530Var5;
                    }
                    f530Var4 = f530Var3;
                } else {
                    btsVar.Y();
                    f530Var4 = f530Var2;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.QrCodeKt$QrCode$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void invoke(fid fidVar2, int i6) {
                            QrCodeKt.QrCode(mhl0.this, str, l8vVar, sessionColor, f530Var4, fidVar2, vng.O(i | 1), i2);
                        }

                        @Override // defpackage.wls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((fid) obj2, ((Number) obj3).intValue());
                            return zy11.a;
                        }
                    };
                    return;
                }
                return;
            }
            f530Var2 = f530Var;
            if ((i3 & 9363) == 9362) {
            }
            c530 c530Var2 = c530.a;
            if (i4 != 0) {
            }
            if (Flags.INSTANCE.getPlayerDebugViewFlags(btsVar, 6).getShowQrCode()) {
            }
            f530Var4 = f530Var3;
            v = btsVar.v();
            if (v != null) {
            }
        }
        sessionColor2 = sessionColor;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f530Var2 = f530Var;
        if ((i3 & 9363) == 9362) {
        }
        c530 c530Var22 = c530.a;
        if (i4 != 0) {
        }
        if (Flags.INSTANCE.getPlayerDebugViewFlags(btsVar, 6).getShowQrCode()) {
        }
        f530Var4 = f530Var3;
        v = btsVar.v();
        if (v != null) {
        }
    }

    private static final long toColor(SessionColor sessionColor) {
        int i = WhenMappings.$EnumSwitchMapping$0[sessionColor.ordinal()];
        if (i == 1) {
            int i2 = ldc.n;
            return ldc.h;
        }
        if (i == 2) {
            int i3 = ldc.n;
            return ldc.j;
        }
        if (i == 3) {
            int i4 = ldc.n;
            return ldc.g;
        }
        if (i == 4) {
            int i5 = ldc.n;
            return ldc.l;
        }
        w511.b();
        return 0L;
    }
}
