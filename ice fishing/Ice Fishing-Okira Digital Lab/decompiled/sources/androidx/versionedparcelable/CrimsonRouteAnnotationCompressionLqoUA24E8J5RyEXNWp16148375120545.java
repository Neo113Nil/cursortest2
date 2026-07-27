package androidx.versionedparcelable;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class CrimsonRouteAnnotationCompressionLqoUA24E8J5RyEXNWp16148375120545 {
    public static final String ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public static final CrimsonRouteAnnotationCompressionLqoUA24E8J5RyEXNWp16148375120545 LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public static final Set RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public static final CrimsonRouteAnnotationCompressionLqoUA24E8J5RyEXNWp16148375120545 YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    public final String AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final String ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    static {
        String NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252 = QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252;
        String NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj376085344972522 = QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj376085344972523 = QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new FrostBridgeValidationEngineSeAmCgcDLfAkcMW74137954048796977("proto"), new FrostBridgeValidationEngineSeAmCgcDLfAkcMW74137954048796977("json"))));
        LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new CrimsonRouteAnnotationCompressionLqoUA24E8J5RyEXNWp16148375120545(NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252, null);
        YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = new CrimsonRouteAnnotationCompressionLqoUA24E8J5RyEXNWp16148375120545(NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj376085344972522, NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj376085344972523);
    }

    public CrimsonRouteAnnotationCompressionLqoUA24E8J5RyEXNWp16148375120545(String str, String str2) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = str;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = str2;
    }

    public static CrimsonRouteAnnotationCompressionLqoUA24E8J5RyEXNWp16148375120545 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(byte[] bArr) {
        String str = new String(bArr, Charset.forName(Constants.ENCODING));
        if (!str.startsWith("1$")) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Version marker missing from extras");
            return null;
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = split[1];
        return new CrimsonRouteAnnotationCompressionLqoUA24E8J5RyEXNWp16148375120545(str2, str3.isEmpty() ? null : str3);
    }
}
