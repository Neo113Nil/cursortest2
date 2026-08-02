package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class FlutterMutatorsStack {
    private List<a> mutators = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<Path> finalClippingPaths = new ArrayList();
    private float finalOpacity = 1.0f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FlutterMutatorType {
        private static final /* synthetic */ FlutterMutatorType[] $VALUES;
        public static final FlutterMutatorType CLIP_PATH;
        public static final FlutterMutatorType CLIP_RECT;
        public static final FlutterMutatorType CLIP_RRECT;
        public static final FlutterMutatorType OPACITY;
        public static final FlutterMutatorType TRANSFORM;

        static {
            FlutterMutatorType flutterMutatorType = new FlutterMutatorType("CLIP_RECT", 0);
            CLIP_RECT = flutterMutatorType;
            FlutterMutatorType flutterMutatorType2 = new FlutterMutatorType("CLIP_RRECT", 1);
            CLIP_RRECT = flutterMutatorType2;
            FlutterMutatorType flutterMutatorType3 = new FlutterMutatorType("CLIP_PATH", 2);
            CLIP_PATH = flutterMutatorType3;
            FlutterMutatorType flutterMutatorType4 = new FlutterMutatorType("TRANSFORM", 3);
            TRANSFORM = flutterMutatorType4;
            FlutterMutatorType flutterMutatorType5 = new FlutterMutatorType("OPACITY", 4);
            OPACITY = flutterMutatorType5;
            $VALUES = new FlutterMutatorType[]{flutterMutatorType, flutterMutatorType2, flutterMutatorType3, flutterMutatorType4, flutterMutatorType5};
        }

        public static FlutterMutatorType valueOf(String str) {
            return (FlutterMutatorType) Enum.valueOf(FlutterMutatorType.class, str);
        }

        public static FlutterMutatorType[] values() {
            return (FlutterMutatorType[]) $VALUES.clone();
        }
    }

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public float getFinalOpacity() {
        return this.finalOpacity;
    }

    public List<a> getMutators() {
        return this.mutators;
    }

    public void pushClipPath(Path path) {
        this.mutators.add(new a());
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRRect(int i, int i2, int i3, int i4, float[] fArr) {
        Rect rect = new Rect(i, i2, i3, i4);
        this.mutators.add(new a());
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i, int i2, int i3, int i4) {
        Rect rect = new Rect(i, i2, i3, i4);
        this.mutators.add(new a());
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushOpacity(float f) {
        this.mutators.add(new a());
        this.finalOpacity *= f;
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        this.mutators.add(new a());
        this.finalMatrix.preConcat(matrix);
    }
}
