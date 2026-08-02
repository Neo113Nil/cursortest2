package c6;

import com.icefishingapp.icefishing.AbstractC4404f;
import g1.C4523c;
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
import x.C5176n;

/* loaded from: classes2.dex */
public final class c extends i {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5577t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, O7.c cVar, n nVar, Object obj, int i, int i6) {
        super(dVar, cVar, nVar, obj, i);
        this.f5577t = i6;
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
    public final Object b(C0544a reader) {
        Duration ofSeconds;
        Instant ofEpochSecond;
        c cVar = i.f5593j;
        c cVar2 = i.f5591g;
        long j6 = 0;
        c cVar3 = i.f5602s;
        c cVar4 = i.f5598o;
        int i = 0;
        int i6 = 0;
        switch (this.f5577t) {
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
                int i9 = reader.f5567b;
                int i10 = i9 + b9;
                if (i10 > reader.f5568c) {
                    throw new EOFException();
                }
                y8.h hVar = y8.h.f41954w;
                y8.h c9 = C5176n.c(reader.f5566a, i9, b9);
                reader.f5567b = i10;
                return c9;
            case 5:
                int c10 = reader.c();
                while (true) {
                    int f3 = reader.f();
                    if (f3 == -1) {
                        reader.d(c10);
                        ofSeconds = Duration.ofSeconds(j6, i6);
                        kotlin.jvm.internal.h.d(ofSeconds, "ofSeconds(...)");
                        return ofSeconds;
                    }
                    if (f3 == 1) {
                        j6 = ((Number) cVar.b(reader)).longValue();
                    } else if (f3 != 2) {
                        reader.k(f3);
                    } else {
                        i6 = ((Number) cVar2.b(reader)).intValue();
                    }
                }
            case 6:
                int c11 = reader.c();
                while (true) {
                    int f9 = reader.f();
                    if (f9 == -1) {
                        reader.d(c11);
                        return v.f41353a;
                    }
                    reader.k(f9);
                }
            case 7:
                return Integer.valueOf(reader.h());
            case 8:
                return Long.valueOf(reader.i());
            case 9:
                int c12 = reader.c();
                while (true) {
                    int f10 = reader.f();
                    if (f10 == -1) {
                        reader.d(c12);
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
                long m4 = reader.m();
                return Long.valueOf((-(m4 & 1)) ^ (m4 >>> 1));
            case 14:
                return reader.j();
            case 15:
                kotlin.jvm.internal.h.e(reader, "reader");
                ArrayList arrayList = new ArrayList();
                int c13 = reader.c();
                while (true) {
                    int f11 = reader.f();
                    if (f11 == -1) {
                        reader.d(c13);
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
                int c14 = reader.c();
                while (true) {
                    int f12 = reader.f();
                    if (f12 == -1) {
                        reader.d(c14);
                        return linkedHashMap;
                    }
                    if (f12 != 1) {
                        reader.n();
                    } else {
                        int c15 = reader.c();
                        String str = null;
                        Object obj = null;
                        while (true) {
                            int f13 = reader.f();
                            if (f13 == -1) {
                                reader.d(c15);
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
                throw new IOException(AbstractC4404f.e(l10, "expected 0 but was "));
            case 18:
                kotlin.jvm.internal.h.e(reader, "reader");
                int c16 = reader.c();
                while (true) {
                    Object obj2 = null;
                    while (true) {
                        int f14 = reader.f();
                        if (f14 == -1) {
                            reader.d(c16);
                            return obj2;
                        }
                        switch (f14) {
                            case 1:
                                break;
                            case 2:
                                obj2 = i.f5596m.b(reader);
                                break;
                            case 3:
                                cVar4.getClass();
                                obj2 = reader.j();
                                break;
                            case 4:
                                obj2 = i.f5590f.b(reader);
                                break;
                            case 5:
                                obj2 = i.f5599p.b(reader);
                                break;
                            case 6:
                                obj2 = i.f5600q.b(reader);
                                break;
                            default:
                                reader.n();
                                break;
                        }
                    }
                    i.f5601r.b(reader);
                }
                break;
            case 19:
                return Integer.valueOf(reader.l());
            default:
                return Long.valueOf(reader.m());
        }
    }

    @Override // c6.i
    public final Object c(C4523c reader) {
        Duration ofSeconds;
        Instant ofEpochSecond;
        c cVar = i.f5593j;
        c cVar2 = i.f5591g;
        long j6 = 0;
        c cVar3 = i.f5602s;
        c cVar4 = i.f5598o;
        int i = 0;
        int i6 = 0;
        Object obj = null;
        switch (this.f5577t) {
            case 0:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Double.valueOf(Double.longBitsToDouble(((C0544a) reader.f37627u).i()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(((C0544a) reader.f37627u).h()));
            case 2:
                throw new IllegalStateException("Operation not supported.");
            case 3:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Boolean.valueOf(((C0544a) reader.f37627u).l() != 0);
            case 4:
                kotlin.jvm.internal.h.e(reader, "reader");
                C0544a c0544a = (C0544a) reader.f37627u;
                int b9 = c0544a.b();
                int i9 = c0544a.f5567b;
                int i10 = i9 + b9;
                if (i10 > c0544a.f5568c) {
                    throw new EOFException();
                }
                y8.h hVar = y8.h.f41954w;
                y8.h c9 = C5176n.c(c0544a.f5566a, i9, b9);
                c0544a.f5567b = i10;
                return c9;
            case 5:
                long A9 = reader.A();
                while (true) {
                    int f3 = ((C0544a) reader.f37627u).f();
                    if (f3 == -1) {
                        reader.C(A9);
                        ofSeconds = Duration.ofSeconds(j6, i6);
                        kotlin.jvm.internal.h.d(ofSeconds, "ofSeconds(...)");
                        return ofSeconds;
                    }
                    if (f3 == 1) {
                        j6 = ((Number) cVar.c(reader)).longValue();
                    } else if (f3 != 2) {
                        reader.F(f3);
                    } else {
                        i6 = ((Number) cVar2.c(reader)).intValue();
                    }
                }
            case 6:
                long A10 = reader.A();
                while (true) {
                    int f9 = ((C0544a) reader.f37627u).f();
                    if (f9 == -1) {
                        reader.C(A10);
                        return v.f41353a;
                    }
                    reader.F(f9);
                }
            case 7:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Integer.valueOf(((C0544a) reader.f37627u).h());
            case 8:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Long.valueOf(((C0544a) reader.f37627u).i());
            case 9:
                long A11 = reader.A();
                while (true) {
                    int f10 = ((C0544a) reader.f37627u).f();
                    if (f10 == -1) {
                        reader.C(A11);
                        ofEpochSecond = Instant.ofEpochSecond(j6, i);
                        kotlin.jvm.internal.h.d(ofEpochSecond, "ofEpochSecond(...)");
                        return ofEpochSecond;
                    }
                    if (f10 == 1) {
                        j6 = ((Number) cVar.c(reader)).longValue();
                    } else if (f10 != 2) {
                        reader.F(f10);
                    } else {
                        i = ((Number) cVar2.c(reader)).intValue();
                    }
                }
            case 10:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Integer.valueOf(((C0544a) reader.f37627u).l());
            case 11:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Long.valueOf(((C0544a) reader.f37627u).m());
            case 12:
                int l9 = ((C0544a) reader.f37627u).l();
                return Integer.valueOf((-(l9 & 1)) ^ (l9 >>> 1));
            case 13:
                long m4 = ((C0544a) reader.f37627u).m();
                return Long.valueOf((-(m4 & 1)) ^ (m4 >>> 1));
            case 14:
                kotlin.jvm.internal.h.e(reader, "reader");
                return ((C0544a) reader.f37627u).j();
            case 15:
                kotlin.jvm.internal.h.e(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long A12 = reader.A();
                while (true) {
                    C0544a c0544a2 = (C0544a) reader.f37627u;
                    int f11 = c0544a2.f();
                    if (f11 == -1) {
                        reader.C(A12);
                        return arrayList;
                    }
                    if (f11 != 1) {
                        c0544a2.n();
                    } else {
                        arrayList.add(cVar3.c(reader));
                    }
                }
            case 16:
                kotlin.jvm.internal.h.e(reader, "reader");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long A13 = reader.A();
                while (true) {
                    C0544a c0544a3 = (C0544a) reader.f37627u;
                    int f12 = c0544a3.f();
                    if (f12 == -1) {
                        reader.C(A13);
                        return linkedHashMap;
                    }
                    if (f12 != 1) {
                        c0544a3.n();
                    } else {
                        long A14 = reader.A();
                        Object obj2 = obj;
                        Object obj3 = obj2;
                        while (true) {
                            int f13 = c0544a3.f();
                            if (f13 == -1) {
                                reader.C(A14);
                                if (obj2 != null) {
                                    linkedHashMap.put(obj2, obj3);
                                }
                            } else if (f13 == 1) {
                                obj2 = cVar4.c(reader);
                            } else if (f13 != 2) {
                                reader.F(f13);
                            } else {
                                obj3 = cVar3.c(reader);
                            }
                        }
                    }
                    obj = null;
                }
            case 17:
                kotlin.jvm.internal.h.e(reader, "reader");
                int l10 = ((C0544a) reader.f37627u).l();
                if (l10 == 0) {
                    return null;
                }
                throw new IOException(AbstractC4404f.e(l10, "expected 0 but was "));
            case 18:
                kotlin.jvm.internal.h.e(reader, "reader");
                long A15 = reader.A();
                while (true) {
                    Object obj4 = null;
                    while (true) {
                        C0544a c0544a4 = (C0544a) reader.f37627u;
                        int f14 = c0544a4.f();
                        if (f14 == -1) {
                            reader.C(A15);
                            return obj4;
                        }
                        switch (f14) {
                            case 1:
                                break;
                            case 2:
                                obj4 = i.f5596m.c(reader);
                                break;
                            case 3:
                                obj4 = cVar4.c(reader);
                                break;
                            case 4:
                                obj4 = i.f5590f.c(reader);
                                break;
                            case 5:
                                obj4 = i.f5599p.c(reader);
                                break;
                            case 6:
                                obj4 = i.f5600q.c(reader);
                                break;
                            default:
                                c0544a4.n();
                                break;
                        }
                    }
                    i.f5601r.c(reader);
                }
                break;
            case 19:
                kotlin.jvm.internal.h.e(reader, "reader");
                return Integer.valueOf(((C0544a) reader.f37627u).l());
            default:
                return Long.valueOf(((C0544a) reader.f37627u).m());
        }
    }

    @Override // c6.i
    public final void d(F1.a writer, Object obj) {
        long epochSecond;
        int nano;
        switch (this.f5577t) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                ((y8.f) writer.f903u).r(Double.doubleToLongBits(doubleValue));
                return;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                ((y8.f) writer.f903u).s(Float.floatToIntBits(floatValue));
                return;
            case 2:
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e((Void) obj, "value");
                throw new IllegalStateException("Operation not supported.");
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.x(booleanValue ? 1 : 0);
                return;
            case 4:
                y8.h value = (y8.h) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value, "value");
                writer.v(value);
                return;
            case 5:
                Duration value2 = S3.i.m(obj);
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value2, "value");
                long i = i(value2);
                if (i != 0) {
                    i.f5593j.e(writer, 1, Long.valueOf(i));
                }
                int h9 = h(value2);
                if (h9 != 0) {
                    i.f5591g.e(writer, 2, Integer.valueOf(h9));
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
                ((y8.f) writer.f903u).s(intValue);
                return;
            case 8:
                long longValue = ((Number) obj).longValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                ((y8.f) writer.f903u).r(longValue);
                return;
            case 9:
                Instant value3 = S3.i.o(obj);
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value3, "value");
                epochSecond = value3.getEpochSecond();
                if (epochSecond != 0) {
                    i.f5593j.e(writer, 1, Long.valueOf(epochSecond));
                }
                nano = value3.getNano();
                if (nano != 0) {
                    i.f5591g.e(writer, 2, Integer.valueOf(nano));
                    return;
                }
                return;
            case 10:
                int intValue2 = ((Number) obj).intValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                if (intValue2 >= 0) {
                    writer.x(intValue2);
                    return;
                } else {
                    writer.y(intValue2);
                    return;
                }
            case 11:
                long longValue2 = ((Number) obj).longValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.y(longValue2);
                return;
            case 12:
                int intValue3 = ((Number) obj).intValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.x((intValue3 >> 31) ^ (intValue3 << 1));
                return;
            case 13:
                long longValue3 = ((Number) obj).longValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.y((longValue3 >> 63) ^ (longValue3 << 1));
                return;
            case 14:
                String value4 = (String) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                kotlin.jvm.internal.h.e(value4, "value");
                ((y8.f) writer.f903u).u(value4);
                return;
            case 15:
                List list = (List) obj;
                kotlin.jvm.internal.h.e(writer, "writer");
                if (list == null) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i.f5602s.e(writer, 1, it.next());
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
                    c cVar = i.f5598o;
                    int g4 = cVar.g(1, str);
                    c cVar2 = i.f5602s;
                    int g9 = cVar2.g(2, value5) + g4;
                    writer.w(1, d.f5580w);
                    writer.x(g9);
                    cVar.e(writer, 1, str);
                    cVar2.e(writer, 2, value5);
                }
                return;
            case 17:
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.x(0);
                return;
            case 18:
                kotlin.jvm.internal.h.e(writer, "writer");
                if (obj == null) {
                    i.f5601r.e(writer, 1, obj);
                    return;
                }
                if (obj instanceof Number) {
                    i.f5596m.e(writer, 2, Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    i.f5598o.e(writer, 3, obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    i.f5590f.e(writer, 4, obj);
                    return;
                }
                if (obj instanceof Map) {
                    i.f5599p.e(writer, 5, (Map) obj);
                    return;
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalArgumentException("unexpected struct value: " + obj);
                    }
                    i.f5600q.e(writer, 6, obj);
                    return;
                }
            case 19:
                int intValue4 = ((Number) obj).intValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.x(intValue4);
                return;
            default:
                long longValue4 = ((Number) obj).longValue();
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.y(longValue4);
                return;
        }
    }

    @Override // c6.i
    public void e(F1.a writer, int i, Object obj) {
        switch (this.f5577t) {
            case 17:
                kotlin.jvm.internal.h.e(writer, "writer");
                writer.w(i, this.f5603a);
                writer.x(0);
                break;
            case 18:
                kotlin.jvm.internal.h.e(writer, "writer");
                if (obj != null) {
                    super.e(writer, i, obj);
                    break;
                } else {
                    writer.w(i, this.f5603a);
                    writer.x(f(obj));
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
        c cVar = i.f5591g;
        c cVar2 = i.f5593j;
        c cVar3 = i.f5602s;
        c cVar4 = i.f5598o;
        switch (this.f5577t) {
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
                Duration value2 = S3.i.m(obj);
                kotlin.jvm.internal.h.e(value2, "value");
                long i = i(value2);
                r12 = i != 0 ? cVar2.g(1, Long.valueOf(i)) : 0;
                int h9 = h(value2);
                return h9 != 0 ? r12 + cVar.g(2, Integer.valueOf(h9)) : r12;
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
                Instant value3 = S3.i.o(obj);
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
                return com.bumptech.glide.h.p(((Number) obj).longValue());
            case 12:
                int intValue2 = ((Number) obj).intValue();
                int i6 = (intValue2 >> 31) ^ (intValue2 << 1);
                if ((i6 & (-128)) == 0) {
                    return 1;
                }
                if ((i6 & (-16384)) == 0) {
                    return 2;
                }
                if ((i6 & (-2097152)) == 0) {
                    return 3;
                }
                return (i6 & (-268435456)) == 0 ? 4 : 5;
            case 13:
                long longValue = ((Number) obj).longValue();
                return com.bumptech.glide.h.p((longValue >> 63) ^ (longValue << 1));
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
                        int g4 = cVar3.g(2, entry.getValue()) + cVar4.g(1, (String) entry.getKey());
                        d dVar = d.f5578u;
                        r12 += com.bumptech.glide.h.o(g4) + com.bumptech.glide.h.o(8) + g4;
                    }
                }
                return r12;
            case 17:
                return 1;
            case 18:
                if (obj == null) {
                    return i.f5601r.g(1, obj);
                }
                if (obj instanceof Number) {
                    return i.f5596m.g(2, Double.valueOf(((Number) obj).doubleValue()));
                }
                if (obj instanceof String) {
                    return cVar4.g(3, obj);
                }
                if (obj instanceof Boolean) {
                    return i.f5590f.g(4, obj);
                }
                if (obj instanceof Map) {
                    return i.f5599p.g(5, (Map) obj);
                }
                if (obj instanceof List) {
                    return i.f5600q.g(6, obj);
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
                return com.bumptech.glide.h.p(((Number) obj).longValue());
        }
    }

    @Override // c6.i
    public int g(int i, Object obj) {
        switch (this.f5577t) {
            case 17:
                d dVar = d.f5578u;
                break;
            case 18:
                if (obj != null) {
                    break;
                } else {
                    int f3 = f(obj);
                    d dVar2 = d.f5578u;
                    break;
                }
        }
        return super.g(i, obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c() {
        super(d.f5580w, s.a(Void.class), n.f5618u, null);
        this.f5577t = 2;
    }
}
