package androidx.versionedparcelable;

import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class XenoGridInheritancePostfixRSwm52co1OR4nAKR2765477331852593 {
    public int ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public Object LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 0;
    public CharSequence RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public XenoGridInheritancePostfixRSwm52co1OR4nAKR2765477331852593(CharSequence charSequence, int i, Locale locale) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = charSequence;
        if (charSequence.length() < 0) {
            FrostBridgeJITPostfixMylqyMJyT0NakVJzcG66093763923863.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            FrostBridgeJITPostfixMylqyMJyT0NakVJzcG66093763923863.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = wordInstance;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = Math.max(0, -50);
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new QuantumStreamShimContextWo8a7MxMKN0IpLa3nY59701310981583(charSequence, i));
    }

    public boolean ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(int i) {
        CharSequence charSequence = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        int i2 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 + 1;
        if (i > this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!XenoGridInjectionPipelineIZx33zrhf3LqVycsEW24852805145837.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867()) {
                    return false;
                }
                XenoGridInjectionPipelineIZx33zrhf3LqVycsEW24852805145837 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = XenoGridInjectionPipelineIZx33zrhf3LqVycsEW24852805145837.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495() != 1 || ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() {
        CosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134 cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134 = (CosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        String str = (String) this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134 == null) {
            return str.length();
        }
        return (cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 - cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365()) + (str.length() - (this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 - this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365));
    }

    public boolean BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(int i) {
        int i2 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        if (i >= this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 || i2 > i) {
            return false;
        }
        return ObsidianEngineStreamConstructorT3LurlW5yYgGQcSjoV37236918563027.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(Character.codePointAt(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, i));
    }

    public boolean LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(int i) {
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(i);
        if (!((BreakIterator) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).isBoundary(i)) {
            return false;
        }
        if (TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(i) && TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(i - 1) && TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(i + 1)) {
            return false;
        }
        return i <= 0 || i >= this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.length() - 1 || !(YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(i) || YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(i + 1));
    }

    public int NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(int i) {
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(i);
        int preceding = ((BreakIterator) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).preceding(i);
        return (TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(preceding) && ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(preceding) && !YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(preceding)) ? NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(preceding) : preceding;
    }

    public void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(int i) {
        int i2 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        int i3 = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        FrostBridgeJITPostfixMylqyMJyT0NakVJzcG66093763923863.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800("Invalid offset: " + i + ". Valid range is [" + i2 + " , " + i3 + ']');
    }

    public void ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(String str, int i, int i2) {
        if (i > i2) {
            FrostBridgeJITPostfixMylqyMJyT0NakVJzcG66093763923863.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            FrostBridgeJITPostfixMylqyMJyT0NakVJzcG66093763923863.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800("start must be non-negative, but was " + i);
        }
        CosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134 cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134 = (CosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        if (cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134 == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(((String) this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867).length() - i2, 64);
            String str2 = (String) this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            int i3 = i - min;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            int i4 = max - min2;
            int i5 = min2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            CosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134 cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG214197580391342 = new CosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134();
            cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG214197580391342.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = max;
            cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG214197580391342.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = cArr;
            cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG214197580391342.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = length;
            cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG214197580391342.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i4;
            this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG214197580391342;
            this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = i3;
            this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = i5;
            return;
        }
        int i6 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 - cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365()) {
            this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = toString();
            this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = null;
            this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = -1;
            this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = -1;
            ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(str, i, i2);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365()) {
            int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = length2 - cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
            int i9 = cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            do {
                i9 *= 2;
            } while (i9 - cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 < AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
            char[] cArr2 = new char[i9];
            System.arraycopy((char[]) cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, 0, cArr2, 0, cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
            int i10 = cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            int i11 = cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy((char[]) cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, i11, cArr2, i13, (i12 + i11) - i11);
            cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = cArr2;
            cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = i9;
            cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i13;
        }
        int i14 = cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
            System.arraycopy(cArr3, i8, cArr3, cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 - i15, i15);
            cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = i7;
            cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273652 = cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() + i7;
            int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273653 = cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() + i8;
            int i16 = cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            int i17 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273652 - i16;
            char[] cArr4 = (char[]) cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
            System.arraycopy(cArr4, i16, cArr4, cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495, i17);
            cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 += i17;
            cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273653;
        } else {
            cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() + i8;
            cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = i7;
        }
        str.getChars(0, str.length(), (char[]) cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
        cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = str.length() + cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    }

    public boolean RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(int i) {
        int i2 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 + 1;
        if (i > this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 || i2 > i) {
            return false;
        }
        return ObsidianEngineStreamConstructorT3LurlW5yYgGQcSjoV37236918563027.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(Character.codePointBefore(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, i));
    }

    public boolean TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(int i) {
        CharSequence charSequence = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        int i2 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        if (i >= this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!XenoGridInjectionPipelineIZx33zrhf3LqVycsEW24852805145837.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867()) {
                return false;
            }
            XenoGridInjectionPipelineIZx33zrhf3LqVycsEW24852805145837 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = XenoGridInjectionPipelineIZx33zrhf3LqVycsEW24852805145837.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
            if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495() != 1 || ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public int UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(int i) {
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(i);
        int following = ((BreakIterator) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).following(i);
        return (TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(following + (-1)) && TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(following) && !YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(following)) ? UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(following) : following;
    }

    public boolean YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(int i) {
        CharSequence charSequence = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        int i2 = i - 1;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(of, unicodeBlock) && YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public String toString() {
        switch (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134 cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134 = (CosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                String str = (String) this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                if (cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134 == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
                sb.append((char[]) cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, 0, cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
                char[] cArr = (char[]) cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                int i = cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                sb.append(cArr, i, cosmicForgeFunctionJITCtSzS2kPjKMUYnikIG21419758039134.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 - i);
                String str2 = (String) this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                sb.append((CharSequence) str2, this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ XenoGridInheritancePostfixRSwm52co1OR4nAKR2765477331852593() {
    }
}
