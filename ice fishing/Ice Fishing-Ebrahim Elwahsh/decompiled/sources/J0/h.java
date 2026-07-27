package J0;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final String f1314b = s.f("Data");

    /* renamed from: c, reason: collision with root package name */
    public static final h f1315c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1316a;

    static {
        h hVar = new h(new HashMap());
        c(hVar);
        f1315c = hVar;
    }

    public h(h hVar) {
        this.f1316a = new HashMap(hVar.f1316a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0040 -> B:16:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h a(byte[] bArr) {
        ObjectInputStream objectInputStream;
        Throwable e6;
        String str = f1314b;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap hashMap = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e9) {
                Log.e(str, "Error in Data#fromByteArray: ", e9);
            }
            try {
                for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                    hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                }
                try {
                    objectInputStream.close();
                } catch (IOException e10) {
                    Log.e(str, "Error in Data#fromByteArray: ", e10);
                }
                byteArrayInputStream.close();
            } catch (IOException e11) {
                e6 = e11;
                Log.e(str, "Error in Data#fromByteArray: ", e6);
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e12) {
                        Log.e(str, "Error in Data#fromByteArray: ", e12);
                    }
                }
                byteArrayInputStream.close();
                return new h(hashMap);
            } catch (ClassNotFoundException e13) {
                e6 = e13;
                Log.e(str, "Error in Data#fromByteArray: ", e6);
                if (objectInputStream != null) {
                }
                byteArrayInputStream.close();
                return new h(hashMap);
            }
        } catch (IOException e14) {
            e = e14;
            Throwable th2 = e;
            objectInputStream = null;
            e6 = th2;
            Log.e(str, "Error in Data#fromByteArray: ", e6);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new h(hashMap);
        } catch (ClassNotFoundException e15) {
            e = e15;
            Throwable th22 = e;
            objectInputStream = null;
            e6 = th22;
            Log.e(str, "Error in Data#fromByteArray: ", e6);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new h(hashMap);
        } catch (Throwable th3) {
            th = th3;
            if (0 != 0) {
                try {
                    objectInputStream2.close();
                } catch (IOException e16) {
                    Log.e(str, "Error in Data#fromByteArray: ", e16);
                }
            }
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (IOException e17) {
                Log.e(str, "Error in Data#fromByteArray: ", e17);
                throw th;
            }
        }
        return new h(hashMap);
    }

    public static byte[] c(h hVar) {
        ObjectOutputStream objectOutputStream;
        String str = f1314b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e6) {
            e = e6;
        }
        try {
            objectOutputStream.writeInt(hVar.f1316a.size());
            for (Map.Entry entry : hVar.f1316a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e9) {
                Log.e(str, "Error in Data#toByteArray: ", e9);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e10) {
                Log.e(str, "Error in Data#toByteArray: ", e10);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e11) {
            e = e11;
            objectOutputStream2 = objectOutputStream;
            Log.e(str, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e12) {
                    Log.e(str, "Error in Data#toByteArray: ", e12);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e13) {
                Log.e(str, "Error in Data#toByteArray: ", e13);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e14) {
                    Log.e(str, "Error in Data#toByteArray: ", e14);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e15) {
                Log.e(str, "Error in Data#toByteArray: ", e15);
                throw th;
            }
        }
    }

    public final String b(String str) {
        Object obj = this.f1316a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && h.class == obj.getClass()) {
                HashMap hashMap = this.f1316a;
                Set<String> keySet = hashMap.keySet();
                HashMap hashMap2 = ((h) obj).f1316a;
                if (keySet.equals(hashMap2.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap.get(str);
                        Object obj3 = hashMap2.get(str);
                        if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f1316a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap hashMap = this.f1316a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = hashMap.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public h(HashMap hashMap) {
        this.f1316a = new HashMap(hashMap);
    }
}
