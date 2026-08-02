package defpackage;

import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.hmm;
import defpackage.mmm;
import defpackage.nmm;
import defpackage.omm;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpmm;", "Lhip;", "Lhmm;", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class pmm implements hip<hmm> {
    public static final pmm a = new pmm();

    @Metadata(k = 3, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[omm.b.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[6] = 3;
            iArr[2] = 4;
            iArr[3] = 5;
            iArr[4] = 6;
            iArr[5] = 7;
            iArr[7] = 8;
            a = iArr;
        }
    }

    @Override // defpackage.hip
    public final Object a() {
        return imm.a();
    }

    @Override // defpackage.hip
    public final Object b(Object obj, OutputStream outputStream, Continuation continuation) {
        s b;
        Map unmodifiableMap = Collections.unmodifiableMap(((lpi) ((hmm) obj)).a);
        unmodifiableMap.getClass();
        mmm.a p = mmm.p();
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            hmm.a aVar = (hmm.a) entry.getKey();
            Object value = entry.getValue();
            String str = aVar.a;
            if (value instanceof Boolean) {
                omm.a D = omm.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D.d();
                omm.r((omm) D.b, booleanValue);
                b = D.b();
            } else if (value instanceof Float) {
                omm.a D2 = omm.D();
                float floatValue = ((Number) value).floatValue();
                D2.d();
                omm.s((omm) D2.b, floatValue);
                b = D2.b();
            } else if (value instanceof Double) {
                omm.a D3 = omm.D();
                double doubleValue = ((Number) value).doubleValue();
                D3.d();
                omm.q((omm) D3.b, doubleValue);
                b = D3.b();
            } else if (value instanceof Integer) {
                omm.a D4 = omm.D();
                int intValue = ((Number) value).intValue();
                D4.d();
                omm.t((omm) D4.b, intValue);
                b = D4.b();
            } else if (value instanceof Long) {
                omm.a D5 = omm.D();
                long longValue = ((Number) value).longValue();
                D5.d();
                omm.n((omm) D5.b, longValue);
                b = D5.b();
            } else if (value instanceof String) {
                omm.a D6 = omm.D();
                D6.d();
                omm.o((omm) D6.b, (String) value);
                b = D6.b();
            } else {
                if (!(value instanceof Set)) {
                    xq0.q(Intrinsics.h(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                    return null;
                }
                omm.a D7 = omm.D();
                nmm.a q = nmm.q();
                q.d();
                nmm.n((nmm) q.b, (Set) value);
                D7.d();
                omm.p((omm) D7.b, q);
                b = D7.b();
            }
            p.getClass();
            str.getClass();
            p.d();
            mmm.n((mmm) p.b).put(str, (omm) b);
        }
        ((mmm) p.b()).c(outputStream);
        return Unit.a;
    }

    @Override // defpackage.hip
    public final Object c(FileInputStream fileInputStream, Continuation continuation) {
        try {
            mmm q = mmm.q(fileInputStream);
            lpi lpiVar = new lpi(false);
            hmm.b[] bVarArr = (hmm.b[]) Arrays.copyOf(new hmm.b[0], 0);
            lpiVar.d();
            if (bVarArr.length > 0) {
                hmm.b bVar = bVarArr[0];
                throw null;
            }
            Map o = q.o();
            o.getClass();
            for (Map.Entry entry : o.entrySet()) {
                String str = (String) entry.getKey();
                omm ommVar = (omm) entry.getValue();
                str.getClass();
                ommVar.getClass();
                omm.b C = ommVar.C();
                switch (C == null ? -1 : a.a[C.ordinal()]) {
                    case -1:
                        throw new wm6("Value case is null.", null);
                    case 0:
                    default:
                        b6e.s();
                        return null;
                    case 1:
                        lpiVar.h(new hmm.a(str), Boolean.valueOf(ommVar.u()));
                        break;
                    case 2:
                        lpiVar.h(new hmm.a(str), Float.valueOf(ommVar.x()));
                        break;
                    case 3:
                        lpiVar.h(new hmm.a(str), Double.valueOf(ommVar.w()));
                        break;
                    case 4:
                        lpiVar.h(new hmm.a(str), Integer.valueOf(ommVar.y()));
                        break;
                    case 5:
                        lpiVar.h(new hmm.a(str), Long.valueOf(ommVar.z()));
                        break;
                    case 6:
                        hmm.a aVar = new hmm.a(str);
                        String A = ommVar.A();
                        A.getClass();
                        lpiVar.h(aVar, A);
                        break;
                    case 7:
                        hmm.a aVar2 = new hmm.a(str);
                        u.a p = ommVar.B().p();
                        p.getClass();
                        lpiVar.h(aVar2, CollectionsKt.A0(p));
                        break;
                    case 8:
                        throw new wm6("Value not set.", null);
                }
            }
            return lpiVar.c();
        } catch (v e) {
            throw new wm6("Unable to parse preferences proto.", e);
        }
    }
}
