package c6;

import com.google.android.gms.internal.ads.Wv;
import i1.C4586c;
import java.io.EOFException;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import u7.v;
import x.C5175n;

/* loaded from: classes2.dex */
public final class c extends i {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5753t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, O7.c cVar, n nVar, Object obj, int i, int i4) {
        super(dVar, cVar, nVar, obj, i);
        this.f5753t = i4;
    }

    public static int h(Duration duration) {
        long seconds;
        int nano;
        int nano2;
        int nano3;
        seconds = duration.getSeconds();
        if (seconds < 0) {
            nano2 = duration.getNano();
            if (nano2 != 0) {
                nano3 = duration.getNano();
                return nano3 - 1000000000;
            }
        }
        nano = duration.getNano();
        return nano;
    }

    public static long i(Duration duration) {
        long seconds;
        long seconds2;
        int nano;
        long seconds3;
        seconds = duration.getSeconds();
        if (seconds < 0) {
            nano = duration.getNano();
            if (nano != 0) {
                seconds3 = duration.getSeconds();
                return seconds3 + 1;
            }
        }
        seconds2 = duration.getSeconds();
        return seconds2;
    }

    @Override // c6.i
    public final Object b(C0555a reader) {
        Duration ofSeconds;
        Instant ofEpochSecond;
        c cVar = i.f5769j;
        c cVar2 = i.f5767g;
        long j6 = 0;
        c cVar3 = i.f5778s;
        c cVar4 = i.f5774o;
        int i = 0;
        int i4 = 0;
        switch (this.f5753t) {
            case 0:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Double.valueOf(Double.longBitsToDouble(reader.i()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(reader.h()));
            case 2:
                throw new IllegalStateException("Operation not supported.");
            case 3:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Boolean.valueOf(reader.l() != 0);
            case 4:
                int b9 = reader.b();
                int i6 = reader.f5743b;
                int i9 = i6 + b9;
                if (i9 > reader.f5744c) {
                    throw new EOFException();
                }
                y8.h hVar = y8.h.f41925w;
                y8.h e9 = C5175n.e(reader.f5742a, i6, b9);
                reader.f5743b = i9;
                return e9;
            case 5:
                int c9 = reader.c();
                while (true) {
                    int f2 = reader.f();
                    if (f2 == -1) {
                        reader.d(c9);
                        ofSeconds = Duration.ofSeconds(j6, i4);
                        kotlin.jvm.internal.h.d(ofSeconds, "ofSeconds(...)");
                        return ofSeconds;
                    }
                    if (f2 == 1) {
                        j6 = ((Number) cVar.b(reader)).longValue();
                    } else if (f2 != 2) {
                        reader.k(f2);
                    } else {
                        i4 = ((Number) cVar2.b(reader)).intValue();
                    }
                }
            case 6:
                int c10 = reader.c();
                while (true) {
                    int f9 = reader.f();
                    if (f9 == -1) {
                        reader.d(c10);
                        return v.f41073a;
                    }
                    reader.k(f9);
                }
            case 7:
                return Integer.valueOf(reader.h());
            case 8:
                return Long.valueOf(reader.i());
            case 9:
                int c11 = reader.c();
                while (true) {
                    int f10 = reader.f();
                    if (f10 == -1) {
                        reader.d(c11);
                        ofEpochSecond = Instant.ofEpochSecond(j6, i);
                        kotlin.jvm.internal.h.d(ofEpochSecond, "ofEpochSecond(...)");
                        return ofEpochSecond;
                    }
                    if (f10 == 1) {
                        j6 = ((Number) cVar.b(reader)).longValue();
                    } else if (f10 != 2) {
                        reader.k(f10);
                    } else {
                        i = ((Number) cVar2.b(reader)).intValue();
                    }
                }
            case 10:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Integer.valueOf(reader.l());
            case 11:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Long.valueOf(reader.m());
            case 12:
                int l9 = reader.l();
                return Integer.valueOf((-(l9 & 1)) ^ (l9 >>> 1));
            case 13:
                long m9 = reader.m();
                return Long.valueOf((-(m9 & 1)) ^ (m9 >>> 1));
            case 14:
                return reader.j();
            case 15:
                kotlin.jvm.internal.h.e(reader, "reader");
                ArrayList arrayList = new ArrayList();
                int c12 = reader.c();
                while (true) {
                    int f11 = reader.f();
                    if (f11 == -1) {
                        reader.d(c12);
                        return arrayList;
                    }
                    if (f11 != 1) {
                        reader.n();
                    } else {
                        arrayList.add(cVar3.b(reader));
                    }
                }
            case 16:
                kotlin.jvm.internal.h.e(reader, "reader");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int c13 = reader.c();
                while (true) {
                    int f12 = reader.f();
                    if (f12 == -1) {
                        reader.d(c13);
                        return linkedHashMap;
                    }
                    if (f12 != 1) {
                        reader.n();
                    } else {
                        int c14 = reader.c();
                        String str = null;
                        Object obj = null;
                        while (true) {
                            int f13 = reader.f();
                            if (f13 == -1) {
                                reader.d(c14);
                                if (str != null) {
                                    linkedHashMap.put(str, obj);
                                }
                            } else if (f13 == 1) {
                                cVar4.getClass();
                                str = reader.j();
                            } else if (f13 != 2) {
                                reader.k(f13);
                            } else {
                                obj = cVar3.b(reader);
                            }
                        }
                    }
                }
            case 17:
                kotlin.jvm.internal.h.e(reader, "reader");
                int l10 = reader.l();
                if (l10 == 0) {
                    return null;
                }
                throw new IOException(Wv.f(l10, "expected 0 but was "));
            case 18:
                kotlin.jvm.internal.h.e(reader, "reader");
                int c15 = reader.c();
                while (true) {
                    Object obj2 = null;
                    while (true) {
                        int f14 = reader.f();
                        if (f14 == -1) {
                            reader.d(c15);
                            return obj2;
                        }
                        switch (f14) {
                            case 1:
                                break;
                            case 2:
                                obj2 = i.f5772m.b(reader);
                                break;
                            case 3:
                                cVar4.getClass();
                                obj2 = reader.j();
                                break;
                            case 4:
                                obj2 = i.f5766f.b(reader);
                                break;
                            case 5:
                                obj2 = i.f5775p.b(reader);
                                break;
                            case 6:
                                obj2 = i.f5776q.b(reader);
                                break;
                            default:
                                reader.n();
                                break;
                        }
                    }
                    i.f5777r.b(reader);
                }
                break;
            case 19:
                return Integer.valueOf(reader.l());
            default:
                return Long.valueOf(reader.m());
        }
    }

    @Override // c6.i
    public final Object c(C4586c reader) {
        Duration ofSeconds;
        Instant ofEpochSecond;
        c cVar = i.f5769j;
        c cVar2 = i.f5767g;
        long j6 = 0;
        c cVar3 = i.f5778s;
        c cVar4 = i.f5774o;
        int i = 0;
        int i4 = 0;
        Object obj = null;
        switch (this.f5753t) {
            case 0:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Double.valueOf(Double.longBitsToDouble(((C0555a) reader.f38154u).i()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(((C0555a) reader.f38154u).h()));
            case 2:
                throw new IllegalStateException("Operation not supported.");
            case 3:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Boolean.valueOf(((C0555a) reader.f38154u).l() != 0);
            case 4:
                kotlin.jvm.internal.h.e(reader, "reader");
                C0555a c0555a = (C0555a) reader.f38154u;
                int b9 = c0555a.b();
                int i6 = c0555a.f5743b;
                int i9 = i6 + b9;
                if (i9 > c0555a.f5744c) {
                    throw new EOFException();
                }
                y8.h hVar = y8.h.f41925w;
                y8.h e9 = C5175n.e(c0555a.f5742a, i6, b9);
                c0555a.f5743b = i9;
                return e9;
            case 5:
                long n9 = reader.n();
                while (true) {
                    int f2 = ((C0555a) reader.f38154u).f();
                    if (f2 == -1) {
                        reader.p(n9);
                        ofSeconds = Duration.ofSeconds(j6, i4);
                        kotlin.jvm.internal.h.d(ofSeconds, "ofSeconds(...)");
                        return ofSeconds;
                    }
                    if (f2 == 1) {
                        j6 = ((Number) cVar.c(reader)).longValue();
                    } else if (f2 != 2) {
                        reader.t(f2);
                    } else {
                        i4 = ((Number) cVar2.c(reader)).intValue();
                    }
                }
            case 6:
                long n10 = reader.n();
                while (true) {
                    int f9 = ((C0555a) reader.f38154u).f();
                    if (f9 == -1) {
                        reader.p(n10);
                        return v.f41073a;
                    }
                    reader.t(f9);
                }
            case 7:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Integer.valueOf(((C0555a) reader.f38154u).h());
            case 8:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Long.valueOf(((C0555a) reader.f38154u).i());
            case 9:
                long n11 = reader.n();
                while (true) {
                    int f10 = ((C0555a) reader.f38154u).f();
                    if (f10 == -1) {
                        reader.p(n11);
                        ofEpochSecond = Instant.ofEpochSecond(j6, i);
                        kotlin.jvm.internal.h.d(ofEpochSecond, "ofEpochSecond(...)");
                        return ofEpochSecond;
                    }
                    if (f10 == 1) {
                        j6 = ((Number) cVar.c(reader)).longValue();
                    } else if (f10 != 2) {
                        reader.t(f10);
                    } else {
                        i = ((Number) cVar2.c(reader)).intValue();
                    }
                }
            case 10:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Integer.valueOf(((C0555a) reader.f38154u).l());
            case 11:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Long.valueOf(((C0555a) reader.f38154u).m());
            case 12:
                int l9 = ((C0555a) reader.f38154u).l();
                return Integer.valueOf((-(l9 & 1)) ^ (l9 >>> 1));
            case 13:
                long m9 = ((C0555a) reader.f38154u).m();
                return Long.valueOf((-(m9 & 1)) ^ (m9 >>> 1));
            case 14:
                kotlin.jvm.internal.h.e(reader, "reader");
                return ((C0555a) reader.f38154u).j();
            case 15:
                kotlin.jvm.internal.h.e(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long n12 = reader.n();
                while (true) {
                    C0555a c0555a2 = (C0555a) reader.f38154u;
                    int f11 = c0555a2.f();
                    if (f11 == -1) {
                        reader.p(n12);
                        return arrayList;
                    }
                    if (f11 != 1) {
                        c0555a2.n();
                    } else {
                        arrayList.add(cVar3.c(reader));
                    }
                }
            case 16:
                kotlin.jvm.internal.h.e(reader, "reader");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long n13 = reader.n();
                while (true) {
                    C0555a c0555a3 = (C0555a) reader.f38154u;
                    int f12 = c0555a3.f();
                    if (f12 == -1) {
                        reader.p(n13);
                        return linkedHashMap;
                    }
                    if (f12 != 1) {
                        c0555a3.n();
                    } else {
                        long n14 = reader.n();
                        Object obj2 = obj;
                        Object obj3 = obj2;
                        while (true) {
                            int f13 = c0555a3.f();
                            if (f13 == -1) {
                                reader.p(n14);
                                if (obj2 != null) {
                                    linkedHashMap.put(obj2, obj3);
                                }
                            } else if (f13 == 1) {
                                obj2 = cVar4.c(reader);
                            } else if (f13 != 2) {
                                reader.t(f13);
                            } else {
                                obj3 = cVar3.c(reader);
                            }
                        }
                    }
                    obj = null;
                }
            case 17:
                kotlin.jvm.internal.h.e(reader, "reader");
                int l10 = ((C0555a) reader.f38154u).l();
                if (l10 == 0) {
                    return null;
                }
                throw new IOException(Wv.f(l10, "expected 0 but was "));
            case 18:
                kotlin.jvm.internal.h.e(reader, "reader");
                long n15 = reader.n();
                while (true) {
                    Object obj4 = null;
                    while (true) {
                        C0555a c0555a4 = (C0555a) reader.f38154u;
                        int f14 = c0555a4.f();
                        if (f14 == -1) {
                            reader.p(n15);
                            return obj4;
                        }
                        switch (f14) {
                            case 1:
                                break;
                            case 2:
                                obj4 = i.f5772m.c(reader);
                                break;
                            case 3:
                                obj4 = cVar4.c(reader);
                                break;
                            case 4:
                                obj4 = i.f5766f.c(reader);
                                break;
                            case 5:
                                obj4 = i.f5775p.c(reader);
                                break;
                            case 6:
                                obj4 = i.f5776q.c(reader);
                                break;
                            default:
                                c0555a4.n();
                                break;
                        }
                    }
                    i.f5777r.c(reader);
                }
                break;
            case 19:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Integer.valueOf(((C0555a) reader.f38154u).l());
            default:
                return Long.valueOf(((C0555a) reader.f38154u).m());
        }
    }

    @Override // c6.i
    public final void d(n4.c writer, Object obj) {
        long epochSecond;
        int nano;
        switch (this.f5753t) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                ((y8.f) writer.f39658u).r(Double.doubleToLongBits(doubleValue));
                return;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                ((y8.f) writer.f39658u).s(Float.floatToIntBits(floatValue));
                return;
            case 2:
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e((Void) obj, "value");
                throw new IllegalStateException("Operation not supported.");
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.E(booleanValue ? 1 : 0);
                return;
            case 4:
                y8.h value = (y8.h) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value, "value");
                writer.C(value);
                return;
            case 5:
                Duration value2 = S6.a.m(obj);
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value2, "value");
                long i = i(value2);
                if (i != 0) {
                    i.f5769j.e(writer, 1, Long.valueOf(i));
                }
                int h3 = h(value2);
                if (h3 != 0) {
                    i.f5767g.e(writer, 2, Integer.valueOf(h3));
                    return;
                }
                return;
            case 6:
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e((v) obj, "value");
                return;
            case 7:
                int intValue = ((Number) obj).intValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                ((y8.f) writer.f39658u).s(intValue);
                return;
            case 8:
                long longValue = ((Number) obj).longValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                ((y8.f) writer.f39658u).r(longValue);
                return;
            case 9:
                Instant value3 = S6.a.o(obj);
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value3, "value");
                epochSecond = value3.getEpochSecond();
                if (epochSecond != 0) {
                    i.f5769j.e(writer, 1, Long.valueOf(epochSecond));
                }
                nano = value3.getNano();
                if (nano != 0) {
                    i.f5767g.e(writer, 2, Integer.valueOf(nano));
                    return;
                }
                return;
            case 10:
                int intValue2 = ((Number) obj).intValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                if (intValue2 >= 0) {
                    writer.E(intValue2);
                    return;
                } else {
                    writer.F(intValue2);
                    return;
                }
            case 11:
                long longValue2 = ((Number) obj).longValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.F(longValue2);
                return;
            case 12:
                int intValue3 = ((Number) obj).intValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.E((intValue3 >> 31) ^ (intValue3 << 1));
                return;
            case 13:
                long longValue3 = ((Number) obj).longValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.F((longValue3 >> 63) ^ (longValue3 << 1));
                return;
            case 14:
                String value4 = (String) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value4, "value");
                ((y8.f) writer.f39658u).u(value4);
                return;
            case 15:
                List list = (List) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                if (list == null) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i.f5778s.e(writer, 1, it.next());
                }
                return;
            case 16:
                Map map = (Map) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                if (map == null) {
                    return;
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value5 = entry.getValue();
                    c cVar = i.f5774o;
                    int g9 = cVar.g(1, str);
                    c cVar2 = i.f5778s;
                    int g10 = cVar2.g(2, value5) + g9;
                    writer.D(1, d.f5756w);
                    writer.E(g10);
                    cVar.e(writer, 1, str);
                    cVar2.e(writer, 2, value5);
                }
                return;
            case 17:
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.E(0);
                return;
            case 18:
                kotlin.jvm.internal.h.e(writer, "writer");
                if (obj == null) {
                    i.f5777r.e(writer, 1, obj);
                    return;
                }
                if (obj instanceof Number) {
                    i.f5772m.e(writer, 2, Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    i.f5774o.e(writer, 3, obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    i.f5766f.e(writer, 4, obj);
                    return;
                }
                if (obj instanceof Map) {
                    i.f5775p.e(writer, 5, (Map) obj);
                    return;
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalArgumentException("unexpected struct value: " + obj);
                    }
                    i.f5776q.e(writer, 6, obj);
                    return;
                }
            case 19:
                int intValue4 = ((Number) obj).intValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.E(intValue4);
                return;
            default:
                long longValue4 = ((Number) obj).longValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.F(longValue4);
                return;
        }
    }

    @Override // c6.i
    public void e(n4.c writer, int i, Object obj) {
        switch (this.f5753t) {
            case 17:
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.D(i, this.f5779a);
                writer.E(0);
                break;
            case 18:
                kotlin.jvm.internal.h.e(writer, "writer");
                if (obj != null) {
                    super.e(writer, i, obj);
                    break;
                } else {
                    writer.D(i, this.f5779a);
                    writer.E(f(obj));
                    d(writer, obj);
                    break;
                }
            default:
                super.e(writer, i, obj);
                break;
        }
    }

    @Override // c6.i
    public final int f(Object obj) {
        long epochSecond;
        int nano;
        c cVar = i.f5767g;
        c cVar2 = i.f5769j;
        c cVar3 = i.f5778s;
        c cVar4 = i.f5774o;
        switch (this.f5753t) {
            case 0:
                ((Number) obj).doubleValue();
                return 8;
            case 1:
                ((Number) obj).floatValue();
                return 4;
            case 2:
                kotlin.jvm.internal.h.e((Void) obj, "value");
                throw new IllegalStateException("Operation not supported.");
            case 3:
                ((Boolean) obj).getClass();
                return 1;
            case 4:
                y8.h value = (y8.h) obj;
                kotlin.jvm.internal.h.e(value, "value");
                return value.a();
            case 5:
                Duration value2 = S6.a.m(obj);
                kotlin.jvm.internal.h.e(value2, "value");
                long i = i(value2);
                r12 = i != 0 ? cVar2.g(1, Long.valueOf(i)) : 0;
                int h3 = h(value2);
                return h3 != 0 ? r12 + cVar.g(2, Integer.valueOf(h3)) : r12;
            case 6:
                kotlin.jvm.internal.h.e((v) obj, "value");
                return 0;
            case 7:
                ((Number) obj).intValue();
                return 4;
            case 8:
                ((Number) obj).longValue();
                return 8;
            case 9:
                Instant value3 = S6.a.o(obj);
                kotlin.jvm.internal.h.e(value3, "value");
                epochSecond = value3.getEpochSecond();
                r12 = epochSecond != 0 ? cVar2.g(1, Long.valueOf(epochSecond)) : 0;
                nano = value3.getNano();
                return nano != 0 ? r12 + cVar.g(2, Integer.valueOf(nano)) : r12;
            case 10:
                int intValue = ((Number) obj).intValue();
                if (intValue < 0) {
                    return 10;
                }
                if ((intValue & (-128)) == 0) {
                    return 1;
                }
                if ((intValue & (-16384)) == 0) {
                    return 2;
                }
                if ((intValue & (-2097152)) == 0) {
                    return 3;
                }
                return (intValue & (-268435456)) == 0 ? 4 : 5;
            case 11:
                return com.bumptech.glide.f.w(((Number) obj).longValue());
            case 12:
                int intValue2 = ((Number) obj).intValue();
                int i4 = (intValue2 >> 31) ^ (intValue2 << 1);
                if ((i4 & (-128)) == 0) {
                    return 1;
                }
                if ((i4 & (-16384)) == 0) {
                    return 2;
                }
                if ((i4 & (-2097152)) == 0) {
                    return 3;
                }
                return (i4 & (-268435456)) == 0 ? 4 : 5;
            case 13:
                long longValue = ((Number) obj).longValue();
                return com.bumptech.glide.f.w((longValue >> 63) ^ (longValue << 1));
            case 14:
                String value4 = (String) obj;
                kotlin.jvm.internal.h.e(value4, "value");
                return (int) y8.b.g(value4);
            case 15:
                List list = (List) obj;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r12 += cVar3.g(1, it.next());
                    }
                }
                return r12;
            case 16:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        int g9 = cVar3.g(2, entry.getValue()) + cVar4.g(1, (String) entry.getKey());
                        d dVar = d.f5754u;
                        r12 += com.bumptech.glide.f.v(g9) + com.bumptech.glide.f.v(8) + g9;
                    }
                }
                return r12;
            case 17:
                return 1;
            case 18:
                if (obj == null) {
                    return i.f5777r.g(1, obj);
                }
                if (obj instanceof Number) {
                    return i.f5772m.g(2, Double.valueOf(((Number) obj).doubleValue()));
                }
                if (obj instanceof String) {
                    return cVar4.g(3, obj);
                }
                if (obj instanceof Boolean) {
                    return i.f5766f.g(4, obj);
                }
                if (obj instanceof Map) {
                    return i.f5775p.g(5, (Map) obj);
                }
                if (obj instanceof List) {
                    return i.f5776q.g(6, obj);
                }
                throw new IllegalArgumentException("unexpected struct value: " + obj);
            case 19:
                int intValue3 = ((Number) obj).intValue();
                if ((intValue3 & (-128)) == 0) {
                    return 1;
                }
                if ((intValue3 & (-16384)) == 0) {
                    return 2;
                }
                if ((intValue3 & (-2097152)) == 0) {
                    return 3;
                }
                return (intValue3 & (-268435456)) == 0 ? 4 : 5;
            default:
                return com.bumptech.glide.f.w(((Number) obj).longValue());
        }
    }

    @Override // c6.i
    public int g(int i, Object obj) {
        switch (this.f5753t) {
            case 17:
                d dVar = d.f5754u;
                break;
            case 18:
                if (obj != null) {
                    break;
                } else {
                    int f2 = f(obj);
                    d dVar2 = d.f5754u;
                    break;
                }
        }
        return super.g(i, obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c() {
        super(d.f5756w, s.a(Void.class), n.f5794u, null);
        this.f5753t = 2;
    }
}
