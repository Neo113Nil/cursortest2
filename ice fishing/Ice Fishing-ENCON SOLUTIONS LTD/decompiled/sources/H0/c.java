package H0;

import a1.C0098n;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends C0098n {

    /* renamed from: a, reason: collision with root package name */
    public static final c f656a = new c();

    @Override // a1.C0098n
    public final Object readValueOfType(byte b2, ByteBuffer byteBuffer) {
        Long l2 = null;
        if (b2 == Byte.MIN_VALUE) {
            ArrayList arrayList = (ArrayList) readValue(byteBuffer);
            a aVar = new a();
            aVar.f653a = (String) arrayList.get(0);
            Object obj = arrayList.get(1);
            if (obj != null) {
                l2 = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            aVar.f654b = l2;
            return aVar;
        }
        if (b2 != -127) {
            return super.readValueOfType(b2, byteBuffer);
        }
        ArrayList arrayList2 = (ArrayList) readValue(byteBuffer);
        d dVar = new d();
        dVar.f657a = (String) arrayList2.get(0);
        dVar.f658b = (String) arrayList2.get(1);
        Object obj2 = arrayList2.get(2);
        if (obj2 != null) {
            l2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
        }
        dVar.f659c = l2;
        dVar.f660d = (Map) arrayList2.get(3);
        dVar.f661e = (Boolean) arrayList2.get(4);
        dVar.f662f = (Boolean) arrayList2.get(5);
        return dVar;
    }

    @Override // a1.C0098n
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof a) {
            byteArrayOutputStream.write(128);
            a aVar = (a) obj;
            aVar.getClass();
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(aVar.f653a);
            arrayList.add(aVar.f654b);
            writeValue(byteArrayOutputStream, arrayList);
            return;
        }
        if (!(obj instanceof d)) {
            super.writeValue(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(129);
        d dVar = (d) obj;
        dVar.getClass();
        ArrayList arrayList2 = new ArrayList(6);
        arrayList2.add(dVar.f657a);
        arrayList2.add(dVar.f658b);
        arrayList2.add(dVar.f659c);
        arrayList2.add(dVar.f660d);
        arrayList2.add(dVar.f661e);
        arrayList2.add(dVar.f662f);
        writeValue(byteArrayOutputStream, arrayList2);
    }
}
