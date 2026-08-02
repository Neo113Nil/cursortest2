package com.squareup.cardcustomizations.signature;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.squareup.cardcustomizations.signature.Point;
import com.squareup.cardcustomizations.signature.Spliner;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes5.dex */
public final class BezierGlyphPainter implements GlyphPainter {
    public RectF boundingBox;
    public final Canvas canvas;
    public final Paint paint;
    public final ArrayList points;
    public final Spliner spliner;

    public BezierGlyphPainter(Canvas canvas, Paint paint) {
        paint.getClass();
        this.canvas = canvas;
        this.paint = paint;
        this.spliner = new Spliner();
        this.points = new ArrayList();
    }

    @Override // com.squareup.cardcustomizations.signature.GlyphPainter
    public final void addPoint(Point.Timestamped timestamped) {
        Point.Timestamped timestamped2;
        timestamped.getClass();
        float f = timestamped.y;
        float f2 = timestamped.x;
        ArrayList arrayList = this.points;
        if (arrayList.isEmpty()) {
            timestamped2 = null;
        } else {
            timestamped2 = (Point.Timestamped) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, arrayList);
            if ((timestamped2.x == f2 && timestamped2.y == f) || timestamped2.time == timestamped.time) {
                return;
            }
        }
        arrayList.add(timestamped);
        Spliner spliner = this.spliner;
        ArrayList arrayList2 = spliner._beziers;
        ArrayList arrayList3 = spliner.points;
        arrayList3.add(timestamped);
        float f3 = 2.0f;
        if (arrayList3.size() == 2 && arrayList3.size() >= 2) {
            Point point = (Point) arrayList3.get(0);
            Point point2 = (Point) arrayList3.get(1);
            arrayList3.add(0, new Point((point.x * 2.0f) - point2.x, (point.y * 2.0f) - point2.y));
        }
        if (arrayList3.size() >= 4) {
            List subList = arrayList3.subList(Math.max(0, arrayList3.size() - 4), arrayList3.size());
            int size = subList.size();
            int i = size - 2;
            float[] fArr = new float[i];
            fArr[0] = (((Point) subList.get(1)).x * 6.0f) - ((Point) subList.get(0)).x;
            int i2 = size - 3;
            int i3 = 1;
            while (i3 < i2) {
                fArr[i3] = ((Point) subList.get(i3)).x * 6.0f;
                i3++;
                f3 = f3;
            }
            float f4 = f3;
            int i4 = size - 1;
            fArr[i2] = (((Point) subList.get(i)).x * 6.0f) - ((Point) subList.get(i4)).x;
            float[] access$computeBSpline = Spliner.Companion.access$computeBSpline(fArr);
            float[] fArr2 = new float[i];
            fArr2[0] = (((Point) subList.get(1)).y * 6.0f) - ((Point) subList.get(0)).y;
            for (int i5 = 1; i5 < i2; i5++) {
                fArr2[i5] = ((Point) subList.get(i5)).y * 6.0f;
            }
            fArr2[i2] = (6.0f * ((Point) subList.get(i)).y) - ((Point) subList.get(i4)).y;
            float[] access$computeBSpline2 = Spliner.Companion.access$computeBSpline(fArr2);
            Point point3 = (Point) subList.get(i2);
            Point point4 = (Point) subList.get(i);
            float f5 = access$computeBSpline[access$computeBSpline.length - 2];
            float f6 = access$computeBSpline2[access$computeBSpline2.length - 2];
            float f7 = access$computeBSpline[access$computeBSpline.length - 1] - f5;
            float f8 = access$computeBSpline2[access$computeBSpline2.length - 1] - f6;
            Point point5 = new Point((f7 / 3.0f) + f5, f6 + (f8 / 3.0f));
            Point point6 = new Point(f5 + ((f7 * f4) / 3.0f), f6 + ((f8 * f4) / 3.0f));
            if (arrayList2.isEmpty()) {
                arrayList2.add(new Spliner.Bezier(point3, point4, point5, point6));
            } else {
                Spliner.Bezier bezier = (Spliner.Bezier) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, arrayList2);
                arrayList2.remove(bezier);
                Point halfWayTo = bezier.control2.halfWayTo(point5);
                arrayList2.add(new Spliner.Bezier(bezier.startPoint, halfWayTo, bezier.control1, bezier.control2));
                arrayList2.add(new Spliner.Bezier(halfWayTo, point4, point5, point6));
            }
        }
        if (timestamped2 == null) {
            this.boundingBox = LinkScanner.unionWith(this.boundingBox, new RectF(f2, f, f2, f));
            return;
        }
        List unmodifiableList = Collections.unmodifiableList(spliner._beziers);
        unmodifiableList.getClass();
        if (unmodifiableList.isEmpty()) {
            this.boundingBox = LinkScanner.unionWith(this.boundingBox, new RectF(f2, f, f2, f));
            return;
        }
        if (unmodifiableList.size() > 1) {
            Spliner.Bezier bezier2 = (Spliner.Bezier) unmodifiableList.get(unmodifiableList.size() - 2);
            bezier2.draw(this.canvas, this.paint);
            RectF rectF = this.boundingBox;
            RectF rectF2 = new RectF();
            bezier2.path.computeBounds(rectF2, false);
            this.boundingBox = LinkScanner.unionWith(rectF, rectF2);
        }
    }

    @Override // com.squareup.cardcustomizations.signature.GlyphPainter
    public final void finish() {
        List unmodifiableList = Collections.unmodifiableList(this.spliner._beziers);
        unmodifiableList.getClass();
        boolean isEmpty = unmodifiableList.isEmpty();
        Paint paint = this.paint;
        Canvas canvas = this.canvas;
        if (isEmpty) {
            ArrayList arrayList = this.points;
            if (!arrayList.isEmpty()) {
                Point point = (Point) arrayList.get(0);
                canvas.drawPoint(point.x, point.y, paint);
            }
        }
        if (unmodifiableList.isEmpty()) {
            return;
        }
        Spliner.Bezier bezier = (Spliner.Bezier) unmodifiableList.get(unmodifiableList.size() - 1);
        bezier.draw(canvas, paint);
        RectF rectF = this.boundingBox;
        RectF rectF2 = new RectF();
        bezier.path.computeBounds(rectF2, false);
        this.boundingBox = LinkScanner.unionWith(rectF, rectF2);
    }

    @Override // com.squareup.cardcustomizations.signature.GlyphPainter
    public final List points() {
        return this.points;
    }
}
