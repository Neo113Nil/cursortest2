package com.squareup.cardcustomizations.signature;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cardcustomizations.signature.Point;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt___RangesKt;
import org.commonmark.internal.util.LinkScanner;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\"H\u0016J,\u0010(\u001a\u00020\"*\u00020\u00162\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*H\u0002J\u0014\u0010.\u001a\u00020\"*\u00020\u00162\u0006\u0010#\u001a\u00020*H\u0002J$\u0010/\u001a\u00020\"*\u00020\u00162\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*H\u0002J!\u00100\u001a\u00020\u001a2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020*01\"\u00020*H\u0002¢\u0006\u0002\u00102R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u00063"}, d2 = {"Lcom/squareup/cardcustomizations/signature/DouglasPeuckerStrokeSimplifier;", "Lcom/squareup/cardcustomizations/signature/GlyphPainter;", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "simplify", "", "<init>", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;Z)V", "getCanvas", "()Landroid/graphics/Canvas;", "getPaint", "()Landroid/graphics/Paint;", "getSimplify", "()Z", "points", "Ljava/util/ArrayList;", "Lcom/squareup/cardcustomizations/signature/Point$Timestamped;", "getPoints", "()Ljava/util/ArrayList;", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "boundingBox", "Landroid/graphics/RectF;", "getBoundingBox", "()Landroid/graphics/RectF;", "setBoundingBox", "(Landroid/graphics/RectF;)V", "getPointCount", "", "addPoint", "", "point", "invalidate", "view", "Landroid/view/View;", "finish", "bezier", "start", "Lcom/squareup/cardcustomizations/signature/Point;", "control1", "control2", "end", "moveTo", "cubicTo", "boundsOfPoints", "", "([Lcom/squareup/cardcustomizations/signature/Point;)Landroid/graphics/RectF;", "customizations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DouglasPeuckerStrokeSimplifier implements GlyphPainter {
    public static final int $stable = 8;
    private RectF boundingBox;
    private final Canvas canvas;
    private final Paint paint;
    private final Path path;
    private final ArrayList<Point.Timestamped> points;
    private final boolean simplify;

    public DouglasPeuckerStrokeSimplifier(Canvas canvas, Paint paint, boolean z) {
        canvas.getClass();
        paint.getClass();
        this.canvas = canvas;
        this.paint = paint;
        this.simplify = z;
        this.points = new ArrayList<>();
        this.path = new Path();
    }

    private final void bezier(Path path, Point point, Point point2, Point point3, Point point4) {
        path.reset();
        moveTo(path, point);
        cubicTo(path, point2, point3, point4);
        this.canvas.drawPath(path, this.paint);
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        this.boundingBox = LinkScanner.unionWith(this.boundingBox, rectF);
    }

    private final RectF boundsOfPoints(Point... points) {
        if (points.length == 0) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        float f = points[0].x;
        int i = 1;
        int length = points.length - 1;
        if (1 <= length) {
            int i2 = 1;
            while (true) {
                f = Math.min(f, points[i2].x);
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        if (points.length == 0) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        float f2 = points[0].y;
        int length2 = points.length - 1;
        if (1 <= length2) {
            int i3 = 1;
            while (true) {
                f2 = Math.min(f2, points[i3].y);
                if (i3 == length2) {
                    break;
                }
                i3++;
            }
        }
        if (points.length == 0) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        float f3 = points[0].x;
        int length3 = points.length - 1;
        if (1 <= length3) {
            int i4 = 1;
            while (true) {
                f3 = Math.max(f3, points[i4].x);
                if (i4 == length3) {
                    break;
                }
                i4++;
            }
        }
        if (points.length == 0) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        float f4 = points[0].y;
        int length4 = points.length - 1;
        if (1 <= length4) {
            while (true) {
                f4 = Math.max(f4, points[i].y);
                if (i == length4) {
                    break;
                }
                i++;
            }
        }
        return new RectF(f, f2, f3, f4);
    }

    private final void cubicTo(Path path, Point point, Point point2, Point point3) {
        path.cubicTo(point.x, point.y, point2.x, point2.y, point3.x, point3.y);
    }

    private final void moveTo(Path path, Point point) {
        path.moveTo(point.x, point.y);
    }

    @Override // com.squareup.cardcustomizations.signature.GlyphPainter
    public void addPoint(Point.Timestamped point) {
        Point.Timestamped timestamped;
        point.getClass();
        if (this.simplify && !this.points.isEmpty()) {
            Point.Timestamped timestamped2 = (Point.Timestamped) CollectionsKt.last((List) this.points);
            timestamped2.getClass();
            point.getClass();
            float f = timestamped2.x - point.x;
            double d = timestamped2.y - point.y;
            if (((float) Math.sqrt((d * d) + (f * f))) < 3.0f) {
                return;
            }
        }
        this.points.add(point);
        int size = this.points.size();
        if (size < 5 || (size - 2) % 3 != 0) {
            return;
        }
        Point.Timestamped timestamped3 = this.points.get(size - 4);
        timestamped3.getClass();
        Point.Timestamped timestamped4 = timestamped3;
        Point.Timestamped timestamped5 = this.points.get(size - 3);
        timestamped5.getClass();
        Point.Timestamped timestamped6 = timestamped5;
        ArrayList<Point.Timestamped> arrayList = this.points;
        if (size > 5) {
            timestamped = arrayList.get(size - 6).halfWayTo(timestamped4);
        } else {
            Point.Timestamped timestamped7 = arrayList.get(0);
            timestamped7.getClass();
            timestamped = timestamped7;
        }
        bezier(this.path, timestamped, timestamped4, timestamped6, timestamped6.halfWayTo((Point) CollectionsKt.last((List) this.points)));
    }

    public RectF boundingBox() {
        RectF rectF = this.boundingBox;
        return rectF == null ? new RectF() : rectF;
    }

    @Override // com.squareup.cardcustomizations.signature.GlyphPainter
    public void finish() {
        Point halfWayTo;
        List slice;
        if (this.points.size() == 1) {
            RectF rectF = this.boundingBox;
            Point point = this.points.get(0);
            point.getClass();
            this.boundingBox = LinkScanner.unionWith(rectF, boundsOfPoints(point));
            Paint paint = new Paint(this.paint);
            paint.setStrokeWidth(this.paint.getStrokeWidth() * 1.5f);
            this.canvas.drawPoint(this.points.get(0).x, this.points.get(0).y, paint);
            return;
        }
        int size = this.points.size();
        ArrayList<Point.Timestamped> arrayList = this.points;
        if (size < 5) {
            Point point2 = arrayList.get(0);
            point2.getClass();
            halfWayTo = point2;
            slice = CollectionsKt.slice(this.points, RangesKt___RangesKt.until(1, size));
        } else {
            int i = size - 2;
            int i2 = i - (i % 3);
            Point.Timestamped timestamped = arrayList.get(i2 - 1);
            int i3 = i2 + 1;
            Point.Timestamped timestamped2 = this.points.get(i3);
            timestamped2.getClass();
            halfWayTo = timestamped.halfWayTo(timestamped2);
            slice = CollectionsKt.slice(this.points, RangesKt___RangesKt.until(i3, size));
        }
        Point point3 = halfWayTo;
        Point point4 = (Point.Timestamped) CollectionsKt.last((List) this.points);
        if (slice.size() == 1) {
            this.canvas.drawLine(point3.x, point3.y, point4.x, point4.y, this.paint);
            this.boundingBox = LinkScanner.unionWith(this.boundingBox, boundsOfPoints(point3, point4));
        } else if (slice.size() == 2) {
            bezier(this.path, point3, (Point) slice.get(1), (Point) slice.get(1), point4);
        } else if (slice.size() == 3) {
            bezier(this.path, point3, (Point) slice.get(1), (Point) slice.get(2), point4);
        }
    }

    public final RectF getBoundingBox() {
        return this.boundingBox;
    }

    public final Canvas getCanvas() {
        return this.canvas;
    }

    public final Paint getPaint() {
        return this.paint;
    }

    public final Path getPath() {
        return this.path;
    }

    public int getPointCount() {
        return this.points.size();
    }

    public final ArrayList<Point.Timestamped> getPoints() {
        return this.points;
    }

    public final boolean getSimplify() {
        return this.simplify;
    }

    public void invalidate(View view) {
        view.getClass();
        view.invalidate();
    }

    public final void setBoundingBox(RectF rectF) {
        this.boundingBox = rectF;
    }

    @Override // com.squareup.cardcustomizations.signature.GlyphPainter
    public ArrayList<Point.Timestamped> points() {
        return this.points;
    }

    public /* synthetic */ DouglasPeuckerStrokeSimplifier(Canvas canvas, Paint paint, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(canvas, paint, (i & 4) != 0 ? true : z);
    }
}
