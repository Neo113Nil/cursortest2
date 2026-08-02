package com.squareup.cardcustomizations.signature;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cardcustomizations.signature.Point;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes5.dex */
public final class Signature {
    public Bitmap bitmap;
    public final Paint bitmapPaint;
    public float boxHeight;
    public float boxWidth;
    public Canvas canvas;
    public Glyph currentGlyph;
    public final ArrayDeque glyphDeque;
    public final int height;
    public boolean isPatternEnabled;
    public final PainterProvider painterProvider;
    public final LinkedHashMap patternGlyphs;
    public final float strokeWidth;
    public final int width;

    /* renamed from: com.squareup.cardcustomizations.signature.Signature$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 implements PainterProvider, FunctionAdapter {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // com.squareup.cardcustomizations.signature.Signature.PainterProvider
        public final GlyphPainter createPainter(Canvas canvas, Paint paint) {
            paint.getClass();
            return new BezierGlyphPainter(canvas, paint);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof PainterProvider) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return new FunctionReferenceImpl(2, BezierGlyphPainter.class, "<init>", "<init>(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public final class Glyph implements Iterable, KMappedMarker {
        public final GlyphPainter painter;
        public long startTime;

        public Glyph(GlyphPainter glyphPainter) {
            glyphPainter.getClass();
            this.painter = glyphPainter;
            this.startTime = -1L;
        }

        public final void add(Point.Timestamped timestamped) {
            timestamped.getClass();
            if (this.startTime < 0) {
                this.startTime = timestamped.time;
            }
            this.painter.addPoint(timestamped);
        }

        @Override // java.lang.Iterable
        public final Iterator iterator() {
            return this.painter.points().iterator();
        }
    }

    public interface PainterProvider {
        GlyphPainter createPainter(Canvas canvas, Paint paint);
    }

    public Signature(int i, int i2, float f, int i3, PainterProvider painterProvider) {
        painterProvider.getClass();
        this.width = i;
        this.height = i2;
        this.strokeWidth = f;
        this.painterProvider = painterProvider;
        this.glyphDeque = new ArrayDeque();
        this.boxWidth = 50.0f;
        this.boxHeight = 50.0f;
        this.patternGlyphs = new LinkedHashMap();
        Paint paint = new Paint(1);
        paint.setColor(i3);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f);
        this.bitmapPaint = paint;
    }

    public final void addPatternGlyphs(List list, Map map) {
        list.getClass();
        map.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Glyph glyph = (Glyph) it.next();
            Canvas canvas = getCanvas();
            PainterProvider painterProvider = this.painterProvider;
            Paint paint = this.bitmapPaint;
            Glyph glyph2 = new Glyph(painterProvider.createPainter(canvas, paint));
            userDrawnGlyphs().add(glyph2);
            Iterator it2 = glyph.iterator();
            while (it2.hasNext()) {
                glyph2.add((Point.Timestamped) it2.next());
            }
            Object obj = map.get(glyph);
            obj.getClass();
            Iterable<Glyph> iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (Glyph glyph3 : iterable) {
                Glyph glyph4 = new Glyph(painterProvider.createPainter(getCanvas(), paint));
                Iterator it3 = glyph3.iterator();
                while (it3.hasNext()) {
                    glyph4.add((Point.Timestamped) it3.next());
                }
                this.currentGlyph = glyph4;
                finishGlyph();
                Glyph glyph5 = this.currentGlyph;
                glyph5.getClass();
                arrayList.add(glyph5);
            }
            this.patternGlyphs.put(glyph2, arrayList);
        }
    }

    public final void extendGlyph(float f, float f2, long j, boolean z) {
        if (this.currentGlyph == null) {
            startGlyph();
        }
        Glyph glyph = this.currentGlyph;
        glyph.getClass();
        glyph.add(new Point.Timestamped(f, f2, j));
        if (z) {
            Float valueOf = Float.valueOf((float) Math.ceil(this.width / this.boxWidth));
            Float valueOf2 = Float.valueOf((float) Math.ceil(this.height / this.boxHeight));
            float floatValue = valueOf.floatValue();
            float floatValue2 = valueOf2.floatValue();
            int i = (int) floatValue;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = (int) floatValue2;
                for (int i5 = 0; i5 < i4; i5++) {
                    float f3 = (this.boxWidth * i5) + (f - (i3 % 2 != 0 ? this.boxWidth / 2.0f : RecyclerView.DECELERATION_RATE));
                    float f4 = (this.boxHeight * i3) + f2;
                    Object obj = this.patternGlyphs.get(this.currentGlyph);
                    obj.getClass();
                    ((Glyph) ((List) obj).get(i2)).add(new Point.Timestamped(f3, f4, j));
                    i2++;
                }
            }
        }
    }

    public final void finishGlyph() {
        Glyph glyph = this.currentGlyph;
        if (glyph != null) {
            glyph.painter.finish();
            List<Glyph> list = (List) this.patternGlyphs.get(this.currentGlyph);
            if (list != null) {
                for (Glyph glyph2 : list) {
                    if (!glyph2.painter.points().isEmpty()) {
                        glyph2.painter.finish();
                    }
                }
            }
        }
    }

    public final Bitmap getBitmap() {
        if (this.bitmap == null) {
            this.bitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ALPHA_8);
        }
        Bitmap bitmap = this.bitmap;
        bitmap.getClass();
        return bitmap;
    }

    public final Canvas getCanvas() {
        if (this.canvas == null) {
            this.canvas = new Canvas(getBitmap());
        }
        Canvas canvas = this.canvas;
        canvas.getClass();
        return canvas;
    }

    public final void startGlyph() {
        boolean z = this.isPatternEnabled;
        Canvas canvas = getCanvas();
        PainterProvider painterProvider = this.painterProvider;
        Paint paint = this.bitmapPaint;
        GlyphPainter createPainter = painterProvider.createPainter(canvas, paint);
        float ceil = (float) Math.ceil(this.width / this.boxWidth);
        float ceil2 = (float) Math.ceil(this.height / this.boxHeight);
        this.currentGlyph = new Glyph(createPainter);
        if (z) {
            int i = ((int) ceil) * ((int) ceil2);
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new Glyph(painterProvider.createPainter(getCanvas(), paint)));
            }
            Glyph glyph = this.currentGlyph;
            glyph.getClass();
            this.patternGlyphs.put(glyph, arrayList);
        }
        List userDrawnGlyphs = userDrawnGlyphs();
        Glyph glyph2 = this.currentGlyph;
        glyph2.getClass();
        userDrawnGlyphs.add(glyph2);
    }

    public final List userDrawnGlyphs() {
        ArrayDeque arrayDeque = this.glyphDeque;
        if (arrayDeque.isEmpty()) {
            arrayDeque.addFirst(new ArrayList());
        }
        Object peekFirst = arrayDeque.peekFirst();
        peekFirst.getClass();
        return (List) peekFirst;
    }

    public final void extendGlyph(float f, float f2, long j) {
        extendGlyph(f, f2, j, this.isPatternEnabled);
    }
}
