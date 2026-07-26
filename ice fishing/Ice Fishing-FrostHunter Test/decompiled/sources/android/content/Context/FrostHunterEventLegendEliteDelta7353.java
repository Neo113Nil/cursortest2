package android.content.Context;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterEventLegendEliteDelta7353 extends FrostHunterGraphQuantumSpeed6562 {
    public static final Pattern FrostHunterBundlePulseFusionHero2475 = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder FrostHunterAlphaAnimationNeoCosmos5761 = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder FrostHunterConstraintSetCloneMasterUltraRogue2633 = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // android.content.Context.FrostHunterGraphQuantumSpeed6562
    public final FrostHunterDialogFragmentTitaniumEpicMega8033 FrostHunterBundlePulseFusionHero2475(FrostHunterSharedFlowUltraNeoDragon7502 frostHunterSharedFlowUltraNeoDragon7502, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        CharsetDecoder charsetDecoder2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new FrostHunterDialogFragmentTitaniumEpicMega8033(new FrostHunterLayoutHyperionShadowBeta6147(null, null, bArr));
        }
        Matcher matcher = FrostHunterBundlePulseFusionHero2475.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String FrostHunterConstraintSetCloneOmegaHyperion9304 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(group);
                FrostHunterConstraintSetCloneOmegaHyperion9304.getClass();
                if (FrostHunterConstraintSetCloneOmegaHyperion9304.equals("streamurl")) {
                    str3 = group2;
                } else if (FrostHunterConstraintSetCloneOmegaHyperion9304.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new FrostHunterDialogFragmentTitaniumEpicMega8033(new FrostHunterLayoutHyperionShadowBeta6147(str2, str3, bArr));
    }
}
