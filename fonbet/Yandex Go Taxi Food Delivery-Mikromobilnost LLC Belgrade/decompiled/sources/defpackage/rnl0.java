package defpackage;

import com.caverock.androidsvg.PreserveAspectRatio$Alignment;
import com.caverock.androidsvg.SVG$Style$LineCap;
import com.caverock.androidsvg.SVG$Style$LineJoin;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class rnl0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[SVG$Style$LineJoin.values().length];
        c = iArr;
        try {
            iArr[SVG$Style$LineJoin.Miter.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            c[SVG$Style$LineJoin.Round.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            c[SVG$Style$LineJoin.Bevel.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[SVG$Style$LineCap.values().length];
        b = iArr2;
        try {
            iArr2[SVG$Style$LineCap.Butt.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[SVG$Style$LineCap.Round.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            b[SVG$Style$LineCap.Square.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[PreserveAspectRatio$Alignment.values().length];
        a = iArr3;
        try {
            iArr3[PreserveAspectRatio$Alignment.xMidYMin.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[PreserveAspectRatio$Alignment.xMidYMid.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[PreserveAspectRatio$Alignment.xMidYMax.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[PreserveAspectRatio$Alignment.xMaxYMin.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            a[PreserveAspectRatio$Alignment.xMaxYMid.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            a[PreserveAspectRatio$Alignment.xMaxYMax.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            a[PreserveAspectRatio$Alignment.xMinYMid.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            a[PreserveAspectRatio$Alignment.xMinYMax.ordinal()] = 8;
        } catch (NoSuchFieldError unused14) {
        }
    }
}
