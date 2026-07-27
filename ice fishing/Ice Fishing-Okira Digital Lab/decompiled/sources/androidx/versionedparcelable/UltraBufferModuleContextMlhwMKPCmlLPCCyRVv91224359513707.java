package androidx.versionedparcelable;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class UltraBufferModuleContextMlhwMKPCmlLPCCyRVv91224359513707 {
    public static Paint AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public static final MysticCacheEngineHashmapZlHyWSU1b4ZjPfmPG583453060494071 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    static {
        ZenithPathOperatorAnnotationFpbtDiBdeccVHe3K6z54410133485305.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new CosmicForgeConcurrencyControllerQpjNZSAx4E2tyN5pDx54586687185784();
        } else if (i >= 29) {
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new NovaLayerMapperBuilderYG6Qzlsvln9dcHKOsc69324002352084();
        } else if (i >= 28) {
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new UltraBufferTranspilerMutexMXm07KutOcHW8V36Sw11545931093011();
        } else if (i >= 26) {
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new ObsidianEngineAsyncExceptionBWHCFitE9HVmW3QucL45436530650683();
        } else if (PhotonFrameResponseAPIUvVjc5GUArcJpuJmqN37349628463694.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 != null) {
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new PhotonFrameResponseAPIUvVjc5GUArcJpuJmqN37349628463694();
        } else {
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new DeltaSignalPayloadDependencyA6nozhzqb35mbLYdQf18383941788059();
        }
        new BlueKernelTokenAdapterGsrAPIk5Ca6MZWDFEr97021029466859(0);
        AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = null;
        Trace.endSection();
    }

    public static Font ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == null) {
            AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new Paint();
        }
        AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.setTextSize(10.0f);
        AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
