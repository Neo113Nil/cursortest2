package com.google.mlkit.vision.text.internal;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public abstract class zzk {
    public static final ViewPager.AnonymousClass1 zzc = new ViewPager.AnonymousClass1(29);

    public static Rect zza(List list) {
        Iterator it = list.iterator();
        int i = PKIFailureInfo.systemUnavail;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            i2 = Math.min(i2, point.x);
            i = Math.max(i, point.x);
            i3 = Math.min(i3, point.y);
            i4 = Math.max(i4, point.y);
        }
        return new Rect(i2, i3, i, i4);
    }

    public static List zzb(zzf zzfVar) {
        Point[] pointArr = new Point[4];
        double sin = Math.sin(Math.toRadians(zzfVar.zze));
        double cos = Math.cos(Math.toRadians(zzfVar.zze));
        int i = zzfVar.zza;
        int i2 = zzfVar.zzb;
        pointArr[0] = new Point(i, i2);
        double d = zzfVar.zzc;
        Point point = new Point((int) (i + (d * cos)), (int) ((d * sin) + i2));
        pointArr[1] = point;
        double d2 = point.x;
        int i3 = zzfVar.zzd;
        pointArr[2] = new Point((int) (d2 - (i3 * sin)), (int) ((i3 * cos) + pointArr[1].y));
        Point point2 = pointArr[0];
        int i4 = point2.x;
        Point point3 = pointArr[2];
        int i5 = point3.x;
        Point point4 = pointArr[1];
        pointArr[3] = new Point((i5 - point4.x) + i4, (point3.y - point4.y) + point2.y);
        return Arrays.asList(pointArr);
    }
}
