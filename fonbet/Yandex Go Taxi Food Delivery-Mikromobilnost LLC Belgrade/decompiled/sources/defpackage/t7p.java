package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public final class t7p extends vhr0 {
    public final int g;
    public final int h;
    public final long i;
    public final kdf j;

    public t7p(int i, int i2, int i3, int i4) {
        super(i3, i4);
        this.g = i;
        this.h = i2;
        this.i = ior.a(0.15f, 0.1f);
        kdf kdfVar = new kdf(0.24f, 0.04f, 0.36f, 0.003f, 0.49f, 0.003f);
        kdfVar.f(new kdf(0.64f, 0.003f, 0.76f, 0.03f, 0.85f, 0.1f));
        kdfVar.f(new kdf(0.95f, 0.17f, 0.99f, 0.28f, 0.99f, 0.43f));
        kdfVar.f(new kdf(0.99f, 0.59f, 0.94f, 0.73f, 0.85f, 0.83f));
        kdfVar.f(new kdf(0.76f, 0.93f, 0.64f, 0.99f, 0.49f, 0.99f));
        kdfVar.f(new kdf(0.36f, 0.99f, 0.24f, 0.93f, 0.15f, 0.83f));
        kdfVar.f(new kdf(0.06f, 0.73f, 0.004f, 0.59f, 0.004f, 0.43f));
        kdfVar.f(new kdf(0.004f, 0.28f, 0.05f, 0.17f, 0.15f, 0.1f));
        this.j = kdfVar;
    }

    @Override // defpackage.vhr0
    public final void a(List list) {
        ArrayList arrayList;
        if (8 > list.size()) {
            arrayList = a.F(list, 1);
        } else {
            int size = list.size() % 8;
            if (size == 0) {
                arrayList = a.F(list, list.size() / 8);
            } else {
                int size2 = list.size() / 8;
                ArrayList arrayList2 = new ArrayList(size);
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList2.add(Integer.valueOf(((8 / size) * i2) % 8));
                }
                List w0 = a.w0(arrayList2);
                ArrayList arrayList3 = new ArrayList(8);
                for (int i3 = 0; i3 < 8; i3++) {
                    arrayList3.add(new ArrayList());
                }
                int i4 = 0;
                while (i < 8) {
                    int i5 = (w0.contains(Integer.valueOf(i)) ? 1 : 0) + size2 + i4;
                    ((List) arrayList3.get(i)).addAll(list.subList(i4, i5));
                    i++;
                    i4 = i5;
                }
                arrayList = arrayList3;
            }
        }
        this.j.a(arrayList, this.e);
    }

    @Override // defpackage.vhr0
    public final boolean b() {
        return this.j.c();
    }

    @Override // defpackage.vhr0
    public final void c(Rect rect, Path path, Matrix matrix) {
        matrix.setTranslate(rect.left, rect.top);
        long j = this.i;
        path.moveTo(htb1.b(j) * rect.width(), htb1.c(j) * rect.height());
        this.j.e(this.i, rect, matrix, path);
    }

    @Override // defpackage.vhr0
    public final void d(Canvas canvas, Paint paint) {
        this.j.b(this.g, this.h, canvas, paint);
    }

    @Override // defpackage.vhr0
    public final void e() {
        this.j.d();
    }
}
