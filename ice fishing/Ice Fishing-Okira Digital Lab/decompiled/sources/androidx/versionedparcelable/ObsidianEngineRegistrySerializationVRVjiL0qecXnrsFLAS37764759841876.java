package androidx.versionedparcelable;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ObsidianEngineRegistrySerializationVRVjiL0qecXnrsFLAS37764759841876 {
    public final int ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final TextPaint AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public CharSequence BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
    public final CharSequence ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public boolean TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public BoringLayout.Metrics YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    public float RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = Float.NaN;
    public float LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = Float.NaN;

    public ObsidianEngineRegistrySerializationVRVjiL0qecXnrsFLAS37764759841876(CharSequence charSequence, TextPaint textPaint, int i) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = charSequence;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = textPaint;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (androidx.versionedparcelable.YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(r2, androidx.versionedparcelable.EmeraldStackBinaryClosureI9d3f9OYExuCyYXFnE69150514532222.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495() {
        if (!Float.isNaN(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867)) {
            return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        }
        BoringLayout.Metrics ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        float f = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 != null ? ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.width : -1;
        TextPaint textPaint = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        if (f < 0.0f) {
            f = (float) Math.ceil(Layout.getDesiredWidth(AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(), 0, AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365().length(), textPaint));
        }
        if (f != 0.0f) {
            CharSequence charSequence = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(spanned, ObsidianEngineClosureBitfieldC9HPQjcufDuIt4tqdc95521464311350.class)) {
                }
                f += 0.5f;
            }
        }
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = f;
        return f;
    }

    public final CharSequence AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() {
        CharSequence charSequence = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if (charSequence != null) {
            charSequence.getClass();
            return charSequence;
        }
        CharSequence charSequence2 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
        }
        this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = charSequence2;
        return charSequence2;
    }

    public final BoringLayout.Metrics ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        if (!this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) {
            TextDirectionHeuristic AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = KryptonFlowMiddlewareCryptographyDfDjn7R2Z1qijIDqlm71510751065434.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            TextPaint textPaint = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = i >= 33 ? BoringLayout.isBoring(charSequence, textPaint, AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, true, null) : !AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = true;
        }
        return this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    }
}
