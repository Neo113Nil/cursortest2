package f1;

import a1.C0098n;
import i1.AbstractC0253j;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0168b extends C0098n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2924a;

    @Override // a1.C0098n
    public final Object readValueOfType(byte b2, ByteBuffer buffer) {
        switch (this.f2924a) {
            case 0:
                kotlin.jvm.internal.i.e(buffer, "buffer");
                if (b2 == -127) {
                    Long l2 = (Long) readValue(buffer);
                    if (l2 != null) {
                        int longValue = (int) l2.longValue();
                        EnumC0164O.f2914b.getClass();
                        EnumC0164O[] values = EnumC0164O.values();
                        int length = values.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            EnumC0164O enumC0164O = values[i2];
                            if (enumC0164O.f2919a == longValue) {
                                break;
                            }
                        }
                        break;
                    }
                } else if (b2 == -126) {
                    Object readValue = readValue(buffer);
                    List list = readValue instanceof List ? (List) readValue : null;
                    if (list != null) {
                        String str = (String) list.get(0);
                        Object obj = list.get(1);
                        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        break;
                    }
                } else if (b2 == -125) {
                    Object readValue2 = readValue(buffer);
                    List list2 = readValue2 instanceof List ? (List) readValue2 : null;
                    if (list2 != null) {
                        String str2 = (String) list2.get(0);
                        Object obj2 = list2.get(1);
                        kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                kotlin.jvm.internal.i.e(buffer, "buffer");
                break;
        }
        return super.readValueOfType(b2, buffer);
    }

    @Override // a1.C0098n
    public final void writeValue(ByteArrayOutputStream stream, Object obj) {
        switch (this.f2924a) {
            case 0:
                kotlin.jvm.internal.i.e(stream, "stream");
                if (!(obj instanceof EnumC0164O)) {
                    if (!(obj instanceof C0176j)) {
                        if (!(obj instanceof C0166Q)) {
                            super.writeValue(stream, obj);
                            break;
                        } else {
                            stream.write(131);
                            C0166Q c0166q = (C0166Q) obj;
                            writeValue(stream, AbstractC0253j.B(c0166q.f2920a, c0166q.f2921b));
                            break;
                        }
                    } else {
                        stream.write(130);
                        C0176j c0176j = (C0176j) obj;
                        writeValue(stream, AbstractC0253j.B(c0176j.f2936a, Boolean.valueOf(c0176j.f2937b)));
                        break;
                    }
                } else {
                    stream.write(129);
                    writeValue(stream, Long.valueOf(((EnumC0164O) obj).f2919a));
                    break;
                }
            default:
                kotlin.jvm.internal.i.e(stream, "stream");
                super.writeValue(stream, obj);
                break;
        }
    }
}
