package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ls5 implements r9c {
    public final ArrayList a;

    public ls5(int i) {
        switch (i) {
            case 2:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0173 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x00be  */
    @Override // defpackage.r9c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(File file) {
        int available;
        byte[] bArr;
        HashMap hashMap;
        HashMap hashMap2;
        gci gciVar;
        HashMap hashMap3;
        file.getClass();
        HashMap hashMap4 = gci.m;
        if (!bp6.a.contains(mvt.class)) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                available = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                bArr = new byte[available];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
            } catch (Exception unused) {
            } catch (Throwable th) {
                bp6.a(mvt.class, th);
            }
            if (available >= 4) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i = wrap.getInt();
                int i2 = i + 4;
                if (available >= i2) {
                    JSONObject jSONObject = new JSONObject(new String(bArr, 4, i, Charsets.UTF_8));
                    JSONArray names = jSONObject.names();
                    int length = names.length();
                    String[] strArr = new String[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        strArr[i3] = names.getString(i3);
                    }
                    int i4 = 1;
                    if (length > 1) {
                        Arrays.sort(strArr);
                    }
                    hashMap = new HashMap();
                    int i5 = 0;
                    while (i5 < length) {
                        String str = strArr[i5];
                        if (str != null) {
                            JSONArray jSONArray = jSONObject.getJSONArray(str);
                            int length2 = jSONArray.length();
                            int[] iArr = new int[length2];
                            for (int i6 = 0; i6 < length2; i6++) {
                                int i7 = jSONArray.getInt(i6);
                                iArr[i6] = i7;
                                i4 *= i7;
                            }
                            int i8 = i4 * 4;
                            int i9 = i2 + i8;
                            if (i9 <= available) {
                                ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i2, i8);
                                wrap2.order(ByteOrder.LITTLE_ENDIAN);
                                n4h n4hVar = new n4h(iArr);
                                wrap2.asFloatBuffer().get(n4hVar.b, 0, i4);
                                hashMap.put(str, n4hVar);
                                i2 = i9;
                            }
                        }
                        i5++;
                        i4 = 1;
                    }
                    if (hashMap != null) {
                        hashMap2 = new HashMap();
                        if (!bp6.a.contains(gci.class)) {
                            try {
                                hashMap3 = gci.m;
                            } catch (Throwable th2) {
                                bp6.a(gci.class, th2);
                            }
                            for (Map.Entry entry : hashMap.entrySet()) {
                                String str2 = (String) entry.getKey();
                                if (!hashMap3.containsKey(entry.getKey()) || (str2 = (String) hashMap3.get(entry.getKey())) != null) {
                                    hashMap2.put(str2, entry.getValue());
                                }
                            }
                            if (hashMap2 != null) {
                                try {
                                    gciVar = new gci(hashMap2);
                                } catch (Exception unused2) {
                                }
                                if (gciVar != null) {
                                    Iterator it = this.a.iterator();
                                    while (it.hasNext()) {
                                        nci nciVar = (nci) it.next();
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(nciVar.d);
                                        sb.append("_");
                                        String i10 = f1d.i(sb, nciVar.g, "_rule");
                                        String str3 = nciVar.f;
                                        iwe iweVar = new iwe(8, nciVar, gciVar);
                                        File file2 = new File(mvt.y(), i10);
                                        if (str3 == null || file2.exists()) {
                                            iweVar.a(file2);
                                        } else {
                                            new s9c(str3, file2, iweVar).execute(new String[0]);
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            gciVar = null;
                            if (gciVar != null) {
                            }
                        }
                        hashMap3 = null;
                        while (r3.hasNext()) {
                        }
                        if (hashMap2 != null) {
                        }
                        gciVar = null;
                        if (gciVar != null) {
                        }
                    }
                    hashMap2 = null;
                    if (hashMap2 != null) {
                    }
                    gciVar = null;
                    if (gciVar != null) {
                    }
                }
            }
        }
        hashMap = null;
        if (hashMap != null) {
        }
        hashMap2 = null;
        if (hashMap2 != null) {
        }
        gciVar = null;
        if (gciVar != null) {
        }
    }

    public void b(Path path) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            sat satVar = (sat) arrayList.get(size);
            Matrix matrix = rvt.a;
            if (satVar != null && !satVar.a) {
                rvt.a(path, satVar.d.l() / 100.0f, satVar.e.l() / 100.0f, satVar.f.l() / 360.0f);
            }
        }
    }

    public synchronized r2o c(Class cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            s2o s2oVar = (s2o) this.a.get(i);
            if (s2oVar.a.isAssignableFrom(cls)) {
                return s2oVar.b;
            }
        }
        return null;
    }

    public ls5(ArrayList arrayList) {
        this.a = arrayList;
    }
}
