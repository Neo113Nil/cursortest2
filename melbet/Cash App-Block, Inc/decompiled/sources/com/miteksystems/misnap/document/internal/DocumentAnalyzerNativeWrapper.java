package com.miteksystems.misnap.document.internal;

import android.util.Log;
import android.util.Size;
import com.miteksystems.misnap.core.LicenseUtil;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import kotlin.Metadata;
import net.oneformapp.helper.HelperFunctions;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u000b\u0010\fJX\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0017\u0010\u0018J`\u0010\u001b\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/miteksystems/misnap/document/internal/DocumentAnalyzerNativeWrapper;", "", "", "license", "", "documentType", "", "newDocumentAnalyzer", "(Ljava/lang/String;I)J", "pointer", "", "deleteDocumentAnalyzer", "(J)V", "", "image", "width", "height", "colorSpace", "geo", "", "orientation", "fourCornerMinConfidence", "Lcom/miteksystems/misnap/document/internal/CoreFlowIqaResults;", "analyze", "(J[BIIIIIZI)Lcom/miteksystems/misnap/document/internal/CoreFlowIqaResults;", "", "bounds", "analyzeBounded", "(J[B[IIIIIIZI)Lcom/miteksystems/misnap/document/internal/CoreFlowIqaResults;", "document-analysis_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class DocumentAnalyzerNativeWrapper {
    public static final boolean d;
    public transient long a;
    public transient boolean b;

    public abstract /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MiSnapSettings.Analysis.Document.Advanced.DocType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr;
        }
    }

    static {
        boolean z;
        try {
            System.loadLibrary("WrapperDocumentAnalysisJni");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            Log.e("DocAnalyzerInternal", "Unable to load document analyzer library", e);
            z = false;
        }
        d = z;
    }

    public static int a(MiSnapSettings.Analysis.Document.Advanced.DocType docType) {
        switch (b.a[docType.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
            case 4:
                return 40;
            case 5:
                return 70;
            case 6:
                return 80;
            case 7:
                return 90;
            case 8:
                return 95;
            default:
                return 100;
        }
    }

    private final native CoreFlowIqaResults analyze(long pointer, byte[] image, int width, int height, int colorSpace, int documentType, int geo, boolean orientation, int fourCornerMinConfidence);

    private final native CoreFlowIqaResults analyzeBounded(long pointer, byte[] image, int[] bounds, int width, int height, int colorSpace, int documentType, int geo, boolean orientation, int fourCornerMinConfidence);

    private final native void deleteDocumentAnalyzer(long pointer);

    private final native long newDocumentAnalyzer(String license, int documentType);

    public final void finalize() {
        synchronized (this) {
            try {
                long j = this.a;
                if (j != 0) {
                    if (this.b) {
                        this.b = false;
                        deleteDocumentAnalyzer(j);
                    }
                    this.a = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final CoreFlowIqaResults a(byte[] bArr, Size size, int i, MiSnapSettings.Analysis.Document.Advanced.DocType docType, MiSnapSettings.Analysis.Document.Check.Geo geo, boolean z, int i2) {
        bArr.getClass();
        size.getClass();
        if (i == 0) {
            throw null;
        }
        docType.getClass();
        return analyze(this.a, bArr, size.getWidth(), size.getHeight(), SVG$Unit$EnumUnboxingLocalUtility.getA(i), a(docType), geo.a, z, i2);
    }

    public final /* synthetic */ boolean a(String str, MiSnapSettings.Analysis.Document.Advanced.DocType docType) {
        str.getClass();
        if (!d) {
            return false;
        }
        boolean z = LicenseUtil.a;
        this.a = newDocumentAnalyzer(HelperFunctions.decode(str), a(docType));
        this.b = true;
        return true;
    }
}
