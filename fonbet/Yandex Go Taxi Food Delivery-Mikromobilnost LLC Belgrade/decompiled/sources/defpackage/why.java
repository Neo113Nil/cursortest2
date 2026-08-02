package defpackage;

import kotlin.Pair;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.masstransit.ui.stopsline.LineState;

/* loaded from: classes15.dex */
public final /* synthetic */ class why implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long w;
    public final /* synthetic */ Object x;

    public /* synthetic */ why(long j, long j2, String str, long j3) {
        this.b = j;
        this.c = j2;
        this.w = j3;
        this.x = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2, types: [long] */
    /* JADX WARN: Type inference failed for: r27v3 */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ldc ldcVar;
        ldc ldcVar2;
        ?? r27;
        Object obj2;
        ldc ldcVar3;
        Object obj3;
        int i = this.a;
        Object obj4 = this.x;
        long j = this.c;
        long j2 = this.b;
        Pair pair = null;
        yw10 yw10Var = null;
        switch (i) {
            case 0:
                LineState lineState = (LineState) obj4;
                qam qamVar = (qam) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32)) / 2.0f;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2.0f;
                float w0 = qamVar.w0(4.0f);
                float w02 = qamVar.w0(4.0f);
                float w03 = qamVar.w0(1.5f);
                float intBitsToFloat3 = (Float.intBitsToFloat((int) (qamVar.c() >> 32)) - w0) / 2.0f;
                int[] iArr = xhy.a;
                switch (iArr[lineState.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        ldcVar = new ldc(j2);
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        ldcVar = new ldc(j);
                        break;
                    case 9:
                    case 10:
                        ldcVar = null;
                        break;
                    default:
                        w511.b();
                        return null;
                }
                switch (iArr[lineState.ordinal()]) {
                    case 1:
                    case 6:
                    case 7:
                    case 10:
                        ldcVar2 = new ldc(j);
                        break;
                    case 2:
                    case 4:
                    case 8:
                    case 9:
                        ldcVar2 = new ldc(j2);
                        break;
                    case 3:
                    case 5:
                        ldcVar2 = null;
                        break;
                    default:
                        w511.b();
                        return null;
                }
                switch (iArr[lineState.ordinal()]) {
                    case 1:
                    case 5:
                    case 8:
                    case 10:
                        pair = new Pair("big_point", new ldc(j));
                        break;
                    case 2:
                    case 6:
                        break;
                    case 3:
                        pair = new Pair("big_point", new ldc(j2));
                        break;
                    case 4:
                    case 7:
                        pair = new Pair("small_circle", null);
                        break;
                    case 9:
                        pair = new Pair("big_point", new ldc(j2));
                        break;
                    default:
                        w511.b();
                        return null;
                }
                if (ldcVar != null) {
                    r27 = ' ';
                    obj2 = "small_circle";
                    ldcVar3 = ldcVar2;
                    obj3 = "big_point";
                    qam.t0(qamVar, ldcVar.a, (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(w0) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f, null, 120);
                } else {
                    r27 = ' ';
                    obj2 = "small_circle";
                    ldcVar3 = ldcVar2;
                    obj3 = "big_point";
                }
                if (ldcVar3 != null) {
                    qam.t0(qamVar, ldcVar3.a, (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat3) << r27), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(w0) << r27), 0.0f, null, 120);
                }
                if (pair != null) {
                    String str = (String) pair.getFirst();
                    ldc ldcVar4 = (ldc) pair.getSecond();
                    boolean l = jl40.l(str, obj3);
                    long j3 = this.w;
                    if (l) {
                        if (ldcVar4 != null) {
                            long j4 = ldcVar4.a;
                            if (ldc.d(j4) < 1.0f) {
                                qam.z(qamVar, j3, w02, (Float.floatToRawIntBits(intBitsToFloat) << r27) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f, null, 0, 120);
                                qam.z(qamVar, j4, w02, (Float.floatToRawIntBits(intBitsToFloat) << r27) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f, null, 0, 120);
                            } else {
                                qam.z(qamVar, j4, w02, (Float.floatToRawIntBits(intBitsToFloat) << r27) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f, null, 0, 120);
                            }
                        }
                    } else if (jl40.l(str, obj2)) {
                        qam.z(qamVar, j3, w03, (Float.floatToRawIntBits(intBitsToFloat) << r27) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f, null, 0, 120);
                    }
                }
                return zy11.a;
            default:
                long j5 = this.w;
                String str2 = (String) obj4;
                ull0 T0 = ((oll0) obj).T0("\n        SELECT * FROM message_translations\n        WHERE chat_internal_id=?\n            AND message_history_id=?\n            AND version=?\n            AND translated_lang=?\n        ");
                try {
                    T0.b(1, j2);
                    T0.b(2, j);
                    T0.b(3, j5);
                    T0.g1(4, str2);
                    int r = eja1.r(T0, "row_id");
                    int r2 = eja1.r(T0, "chat_internal_id");
                    int r3 = eja1.r(T0, "message_history_id");
                    int r4 = eja1.r(T0, "version");
                    int r5 = eja1.r(T0, "original_lang");
                    int r6 = eja1.r(T0, "translated_lang");
                    int r7 = eja1.r(T0, "translated_text");
                    int r8 = eja1.r(T0, "translated_suggests");
                    if (T0.q()) {
                        yw10Var = new yw10(T0.isNull(r) ? null : Long.valueOf(T0.getLong(r)), T0.getLong(r2), T0.getLong(r3), T0.getLong(r4), T0.Y1(r5), T0.Y1(r6), T0.Y1(r7), T0.isNull(r8) ? null : T0.Y1(r8));
                    }
                    return yw10Var;
                } finally {
                    T0.close();
                }
        }
    }

    public /* synthetic */ why(LineState lineState, long j, long j2, long j3) {
        this.x = lineState;
        this.b = j;
        this.c = j2;
        this.w = j3;
    }
}
