package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class ayg {
    public HashMap c;
    public HashMap d;
    public float e;
    public HashMap f;
    public ArrayList g;
    public q4r h;
    public ovg i;
    public ArrayList j;
    public Rect k;
    public float l;
    public float m;
    public float n;
    public boolean o;
    public final okk a = new okk();
    public final HashSet b = new HashSet();
    public int p = 0;

    public final void a(String str) {
        psg.b(str);
        this.b.add(str);
    }

    public final float b() {
        return (long) (((this.m - this.l) / this.n) * 1000.0f);
    }

    public final Map c() {
        float c = rvt.c();
        if (c != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                HashMap hashMap = this.d;
                String str = (String) entry.getKey();
                hzg hzgVar = (hzg) entry.getValue();
                float f = this.e / c;
                int i = (int) (hzgVar.a * f);
                int i2 = (int) (hzgVar.b * f);
                hzg hzgVar2 = new hzg(hzgVar.c, i, i2, hzgVar.d, hzgVar.e);
                Bitmap bitmap = hzgVar.f;
                if (bitmap != null) {
                    hzgVar2.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                hashMap.put(str, hzgVar2);
            }
        }
        this.e = c;
        return this.d;
    }

    public final dbh d(String str) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            dbh dbhVar = (dbh) this.g.get(i);
            String str2 = dbhVar.a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith(StringUtil.CR) && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return dbhVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            sb.append(((iof) it.next()).a(StringUtil.TAB));
        }
        return sb.toString();
    }
}
