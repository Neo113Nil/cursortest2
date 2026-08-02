package defpackage;

import android.graphics.Rect;
import android.media.Image;
import android.net.Uri;
import android.util.SizeF;
import com.google.android.gms.common.a;
import com.google.android.gms.common.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class ycg0 {
    public final zst a;
    public final v5c0 b;

    public ycg0(zst zstVar, v5c0 v5c0Var) {
        this.a = zstVar;
        this.b = v5c0Var;
    }

    public final ggg0 a(Image image, int i) {
        String m;
        zst zstVar = this.a;
        int d = ((a) zstVar.b.getValue()).d(zstVar.a, b.a);
        if (zstVar.c.getAndSet(d) != d) {
            xby.d.d("GSMAvailable", String.valueOf(d));
        }
        if (d != 0) {
            ny61.r("QR recognition is failed because no vendors are available");
            return null;
        }
        xkt xktVar = (xkt) this.b.b;
        SizeF sizeF = (i == 90 || i == 270) ? new SizeF(image.getHeight(), image.getWidth()) : new SizeF(image.getWidth(), image.getHeight());
        xzv c = xzv.c(image, i, null);
        i3a1 i3a1Var = (i3a1) ((sv4) xktVar.a.getValue());
        List<fv4> list = (List) udq0.f(i3a1Var.c(c).p(new egz(i3a1Var, c.d, c.e)));
        ArrayList arrayList = new ArrayList();
        for (fv4 fv4Var : list) {
            if (fv4Var != null && (m = fv4Var.a.m()) != null) {
                Uri parse = Uri.parse(m);
                Rect rect = fv4Var.b;
                if (rect != null) {
                    arrayList.add(new ggg0(parse, rect, sizeF.getWidth(), sizeF.getHeight()));
                }
            }
        }
        return (ggg0) kotlin.collections.a.R(arrayList);
    }
}
