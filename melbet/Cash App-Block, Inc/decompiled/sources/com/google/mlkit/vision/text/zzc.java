package com.google.mlkit.vision.text;

import android.graphics.Rect;
import android.location.Location;
import android.os.Parcel;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.event.EventMapper;
import com.datadog.android.trace.api.tracer.DatadogTracer;
import com.datadog.android.trace.api.tracer.DatadogTracerBuilder;
import com.datadog.android.trace.api.tracer.NoOpDatadogTracer;
import com.datadog.android.trace.model.SpanEvent;
import com.datadog.trace.logger.Logger;
import com.fillr.e;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzde;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.internal.location.zzee;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvb;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.internal.zzk;
import com.google.mlkit.vision.text.zzc;
import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.ionspin.kotlin.bignum.decimal.BigDecimal$Companion$SignificantDecider;
import com.ionspin.kotlin.bignum.decimal.DecimalMode;
import com.ionspin.kotlin.bignum.decimal.RoundingMode;
import com.ionspin.kotlin.bignum.integer.BigInteger;
import com.ionspin.kotlin.bignum.integer.Sign;
import com.ionspin.kotlin.bignum.integer.base63.array.BigInteger63Arithmetic;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.workflow.fragment.FailoverFragment;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.disabled.DependentBitcoinDisabledViewModel;
import com.squareup.cash.bitcoin.views.applet.BitcoinHomeViewKt;
import com.squareup.cash.cashcommercebrowser.api.v1.RestrictedItemCheckRequest;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.crypto.CryptoSpendSearchAddress;
import com.squareup.cash.cdf.crypto.CryptoSpendSelectAddress;
import com.squareup.cash.clientroutes.AuthenticationRequirement;
import com.squareup.cash.crypto.common.presenters.BitcoinP2pConversionPercentagePresenter;
import com.squareup.cash.cryptonauts.api.CryptoFeature;
import com.squareup.cash.deposits.physical.presenter.address.AddressAnalyticsFactory;
import com.squareup.cash.fidesmo.real.RealFidesmoClient;
import com.squareup.cash.idv.ProfilePageUpsellComponentV2;
import com.squareup.cash.lynx.api.v1_0.model.NotVerifiableReason;
import com.squareup.cash.moneybot.backend.api.model.extension.ExtensionConfig$Tool;
import com.stripe.android.utils.MapUtilsKt;
import com.withpersona.sdk2.camera.CameraPropertiesKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.ULongArray;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzc implements DatadogTracerBuilder, EventMapper, Logger, Clock, RemoteCall, ByteString.ByteArrayCopier, zzu, AddressAnalyticsFactory {
    public static volatile zzc INSTANCE;
    public static final /* synthetic */ zzc zza = new zzc(6);
    public final /* synthetic */ int $r8$classId;

    public zzc() {
        this.$r8$classId = 29;
        CollectionsKt__CollectionsJVMKt.listOf(new ExtensionConfig$Tool()).getClass();
    }

    public static final String access$formatPercent(long j) {
        List list = BitcoinP2pConversionPercentagePresenter.DEFAULT_PICKER_OPTIONS;
        if (j % 100 != 0) {
            return String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(j / 100.0d)}, 1)).concat("%");
        }
        return (j / 100) + "%";
    }

    public static final DecimalMode access$resolveDecimalMode(DecimalMode decimalMode, DecimalMode decimalMode2, DecimalMode decimalMode3) {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (decimalMode3 != null) {
            return decimalMode3;
        }
        RoundingMode roundingMode = null;
        if (decimalMode == null && decimalMode2 == null) {
            return new DecimalMode(0L, roundingMode, 7);
        }
        if (decimalMode == null && decimalMode2 != null) {
            return decimalMode2;
        }
        if (decimalMode2 == null && decimalMode != null) {
            return decimalMode;
        }
        decimalMode.getClass();
        RoundingMode roundingMode2 = decimalMode.roundingMode;
        decimalMode2.getClass();
        RoundingMode roundingMode3 = decimalMode2.roundingMode;
        if (roundingMode2 == roundingMode3) {
            return decimalMode.decimalPrecision >= decimalMode2.decimalPrecision ? decimalMode : decimalMode2;
        }
        JWK$$ExternalSyntheticBUOutline0.m("Different rounding modes! This: ", roundingMode2, " Other: ", roundingMode3);
        return null;
    }

    public static final BigDecimal access$roundOrDont(BigInteger bigInteger, long j, DecimalMode decimalMode) {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        return decimalMode.isPrecisionUnlimited ? new BigDecimal(bigInteger, j, 4) : roundSignificand(bigInteger, j, decimalMode);
    }

    public static RealFidesmoClient.FidesmoRequirementId from(String str) {
        Object obj;
        str.getClass();
        EnumEntriesList enumEntriesList = RealFidesmoClient.FidesmoRequirementId.$ENTRIES;
        ArrayIterator m = CameraState$Type$EnumUnboxingLocalUtility.m(enumEntriesList, enumEntriesList);
        while (true) {
            if (!m.hasNext()) {
                obj = null;
                break;
            }
            obj = m.next();
            if (((RealFidesmoClient.FidesmoRequirementId) obj).rawValue.equals(str)) {
                break;
            }
        }
        return (RealFidesmoClient.FidesmoRequirementId) obj;
    }

    public static BigDecimal fromDouble(double d) {
        String str;
        String valueOf = String.valueOf(d);
        if (!StringsKt.contains((CharSequence) valueOf, '.', false) || StringsKt.contains((CharSequence) valueOf, 'E', true)) {
            return parseStringWithMode(valueOf);
        }
        int length = valueOf.length() - 1;
        while (true) {
            if (-1 >= length) {
                str = "";
                break;
            }
            if (valueOf.charAt(length) != '0') {
                str = valueOf.substring(0, length + 1);
                break;
            }
            length--;
        }
        return parseStringWithMode(str);
    }

    public static BigDecimal fromFloat(float f) {
        String str;
        String valueOf = String.valueOf(f);
        if (!StringsKt.contains((CharSequence) valueOf, '.', false) || StringsKt.contains((CharSequence) valueOf, 'E', true)) {
            return parseStringWithMode(valueOf);
        }
        int length = valueOf.length() - 1;
        while (true) {
            if (-1 >= length) {
                str = "";
                break;
            }
            if (valueOf.charAt(length) != '0') {
                str = valueOf.substring(0, length + 1);
                break;
            }
            length--;
        }
        return parseStringWithMode(str);
    }

    public static BigDecimal fromInt(int i) {
        BigInteger63Arithmetic bigInteger63Arithmetic = BigInteger.arithmetic;
        BigInteger fromInt = zzd.fromInt(i);
        return new BigDecimal(fromInt, fromInt.numberOfDecimalDigits() - 1, null, 0);
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static CryptoFeature m2067fromValue(int i) {
        switch (i) {
            case 0:
                return CryptoFeature.FEATURE_UNSPECIFIED;
            case 1:
                return CryptoFeature.BTC_P2P_SEND;
            case 2:
                return CryptoFeature.BTC_P2P_RECEIVE;
            case 3:
                return CryptoFeature.BTC_WITHDRAW;
            case 4:
                return CryptoFeature.BTC_DEPOSIT;
            case 5:
                return CryptoFeature.BTC_LN_WITHDRAW;
            case 6:
                return CryptoFeature.BTC_LN_DEPOSIT;
            case 7:
                return CryptoFeature.BTC_BUY;
            case 8:
                return CryptoFeature.BTC_SELL;
            case 9:
                return CryptoFeature.BTC_BITKEY_TRANSFER;
            case 10:
                return CryptoFeature.BTC_BITKEY_BUY_AND_TRANSFER;
            case 11:
                return CryptoFeature.BTC_DEPOSIT_REVERSAL;
            case 12:
                return CryptoFeature.BTC_BITKEY_SELL;
            case 13:
                return CryptoFeature.BTC_SQUARE_SELLER_LN_PAYMENT;
            case 14:
                return CryptoFeature.BTC_MAP;
            default:
                return null;
        }
    }

    public static FailoverFragment.WorkflowSettings getDefaultWorkflowSettings(MiSnapSettings miSnapSettings) {
        return new FailoverFragment.WorkflowSettings(Integer.valueOf(miSnapSettings.a == MiSnapSettings.UseCase.FACE ? R.layout.misnap_failover_header_face : R.layout.misnap_failover_header_document));
    }

    public static AuthenticationRequirement ofQueryParamValue(String str) {
        return (AuthenticationRequirement) AuthenticationRequirement.queryParamValueToValue.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BigDecimal parseStringWithMode(String str) {
        int i;
        List split$default;
        str.getClass();
        if (str.length() == 0) {
            Mod$$ExternalSyntheticBUOutline0.m$2("Empty string is not a valid decimal number");
            return null;
        }
        int i2 = 0;
        if (StringsKt.contains((CharSequence) str, 'E', true)) {
            if (StringsKt.contains((CharSequence) str, '.', false)) {
                split$default = StringsKt.split$default(str, new char[]{'.'}, 6);
            } else {
                List split$default2 = StringsKt.split$default(str, new char[]{'E', 'e'}, 6);
                split$default = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{split$default2.get(0), Boxes$$ExternalSyntheticOutline1.m("0E", split$default2.get(1))});
            }
            if (split$default.size() != 2) {
                Mod$$ExternalSyntheticBUOutline0.m$2("Invalid (or unsupported) floating point number format: ".concat(str));
                return null;
            }
            int i3 = (str.charAt(0) == '-' || str.charAt(0) == '+') ? 1 : 0;
            Sign sign = i3 != 0 ? str.charAt(0) == '-' ? Sign.NEGATIVE : Sign.POSITIVE : Sign.POSITIVE;
            String substring = ((String) split$default.get(0)).substring(i3);
            List split$default3 = StringsKt.split$default((CharSequence) split$default.get(1), new char[]{'E', 'e'}, 6);
            String str2 = (String) split$default3.get(0);
            String str3 = (String) split$default3.get(1);
            int i4 = (str3.charAt(0) == '-' || str3.charAt(0) == '+') ? 1 : 0;
            Sign sign2 = str3.charAt(0) == '-' ? Sign.NEGATIVE : Sign.POSITIVE;
            String substring2 = str3.substring(i4);
            long parseLong = sign2 == Sign.POSITIVE ? Long.parseLong(substring2, CharsKt.checkRadix(10)) : Long.parseLong(substring2, CharsKt.checkRadix(10)) * (-1);
            int length = substring.length();
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    i5 = -1;
                    break;
                }
                if (substring.charAt(i5) != '0') {
                    break;
                }
                i5++;
            }
            if (i5 == -1) {
                i5 = 0;
            }
            int length2 = str2.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i6 = length2 - 1;
                    if (str2.charAt(length2) != '0') {
                        break;
                    }
                    if (i6 < 0) {
                        break;
                    }
                    length2 = i6;
                }
            }
            length2 = -1;
            if (length2 == -1) {
                length2 = str2.length() - 1;
            }
            String substring3 = substring.substring(i5, substring.length());
            String substring4 = str2.substring(0, length2 + 1);
            BigInteger63Arithmetic bigInteger63Arithmetic = BigInteger.arithmetic;
            BigInteger parseString = zzd.parseString(substring3.concat(substring4));
            if (Intrinsics.areEqual(parseString, BigInteger.ZERO)) {
                sign = Sign.ZERO;
            }
            if (sign == Sign.NEGATIVE) {
                parseString = parseString.negate();
            }
            return new BigDecimal(parseString, (!substring3.equals("0") ? parseLong + substring3.length() : parseLong - (substring4.length() - parseString.numberOfDecimalDigits())) - 1, (DecimalMode) null);
        }
        if (!StringsKt.contains((CharSequence) str, '.', false)) {
            BigInteger63Arithmetic bigInteger63Arithmetic2 = BigInteger.arithmetic;
            BigInteger parseString2 = zzd.parseString(str);
            return new BigDecimal(parseString2, parseString2.numberOfDecimalDigits() - 1, (DecimalMode) null);
        }
        List split$default4 = StringsKt.split$default(str, new char[]{'.'}, 6);
        if (split$default4.size() != 2) {
            Mod$$ExternalSyntheticBUOutline0.m$2("Invalid (or unsupported) floating point number format: ".concat(str));
            return null;
        }
        int i7 = (str.charAt(0) == '-' || str.charAt(0) == '+') ? 1 : 0;
        Sign sign3 = i7 != 0 ? str.charAt(0) == '-' ? Sign.NEGATIVE : Sign.POSITIVE : Sign.POSITIVE;
        String substring5 = ((String) split$default4.get(0)).substring(i7);
        String str4 = (String) split$default4.get(1);
        int length3 = substring5.length();
        int i8 = 0;
        while (true) {
            if (i8 >= length3) {
                i8 = -1;
                break;
            }
            if (substring5.charAt(i8) != '0') {
                break;
            }
            i8++;
        }
        if (i8 == -1) {
            i8 = 0;
        }
        int length4 = str4.length() - 1;
        if (length4 >= 0) {
            while (true) {
                int i9 = length4 - 1;
                if (str4.charAt(length4) != '0') {
                    break;
                }
                if (i9 < 0) {
                    break;
                }
                length4 = i9;
            }
        }
        length4 = -1;
        if (length4 == -1) {
            length4 = str4.length() - 1;
        }
        String substring6 = substring5.substring(i8, substring5.length());
        String substring7 = str4.substring(0, length4 + 1);
        BigInteger63Arithmetic bigInteger63Arithmetic3 = BigInteger.arithmetic;
        BigInteger parseString3 = zzd.parseString(substring6.concat(substring7));
        if (substring6.length() <= 0 || substring6.charAt(0) == '0') {
            int length5 = substring7.length();
            while (true) {
                if (i2 >= length5) {
                    i2 = -1;
                    break;
                }
                if (substring7.charAt(i2) != '0') {
                    break;
                }
                i2++;
            }
            i = (i2 + 1) * (-1);
        } else {
            i = substring6.length() - 1;
        }
        if (Intrinsics.areEqual(parseString3, BigInteger.ZERO)) {
            sign3 = Sign.ZERO;
        }
        if (sign3 == Sign.NEGATIVE) {
            parseString3 = parseString3.negate();
        }
        return new BigDecimal(parseString3, i, (DecimalMode) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static BigInteger roundDiscarded(BigInteger bigInteger, BigInteger bigInteger2, DecimalMode decimalMode) {
        Pair pair;
        BigDecimal$Companion$SignificantDecider bigDecimal$Companion$SignificantDecider;
        long numberOfDecimalDigits = bigInteger.numberOfDecimalDigits();
        long[] jArr = bigInteger.magnitude;
        Sign sign = bigInteger.sign;
        long j = decimalMode.decimalPrecision;
        RoundingMode roundingMode = decimalMode.roundingMode;
        long j2 = numberOfDecimalDigits - j;
        if (j2 > 0) {
            BigInteger.QuotientAndRemainder divrem = bigInteger.divrem(BigInteger.TEN.pow(j2));
            pair = new Pair(divrem.quotient, divrem.remainder);
        } else {
            pair = new Pair(bigInteger, bigInteger2);
        }
        BigInteger bigInteger3 = (BigInteger) pair.first;
        BigInteger bigInteger4 = (BigInteger) pair.second;
        BigInteger bigInteger5 = BigInteger.ZERO;
        Sign sign2 = bigInteger.equals(bigInteger5) ? bigInteger2.sign : sign;
        if (roundingMode == RoundingMode.AWAY_FROM_ZERO || roundingMode == RoundingMode.TOWARDS_ZERO ? !bigInteger4.isZero() || !bigInteger2.isZero() : !bigInteger4.isZero()) {
            BigInteger.QuotientAndRemainder divrem2 = bigInteger4.divrem(BigInteger.TEN.pow(bigInteger4.numberOfDecimalDigits() - 1));
            long[] jArr2 = divrem2.quotient.magnitude;
            Sign sign3 = Sign.POSITIVE;
            int intValue = new BigInteger(jArr2, sign3).intValue();
            BigInteger bigInteger6 = new BigInteger(divrem2.remainder.magnitude, sign3);
            if (intValue == 5) {
                bigDecimal$Companion$SignificantDecider = bigInteger6.equals(bigInteger5) ? BigDecimal$Companion$SignificantDecider.FIVE : BigDecimal$Companion$SignificantDecider.MORE_THAN_FIVE;
            } else if (intValue > 5) {
                bigDecimal$Companion$SignificantDecider = BigDecimal$Companion$SignificantDecider.MORE_THAN_FIVE;
            } else {
                if (intValue >= 5) {
                    OptionalProvider$$ExternalSyntheticLambda0.m$1("Couldn't determine decider");
                    return null;
                }
                bigDecimal$Companion$SignificantDecider = BigDecimal$Companion$SignificantDecider.LESS_THAN_FIVE;
            }
            switch (roundingMode.ordinal()) {
                case 0:
                    if (sign2 != sign3) {
                        return bigInteger3.minus(BigInteger.ONE);
                    }
                    break;
                case 1:
                    if (sign2 == sign3) {
                        return bigInteger3.plus(BigInteger.ONE);
                    }
                    break;
                case 2:
                    return sign2 == sign3 ? bigInteger3.plus(BigInteger.ONE) : bigInteger3.minus(BigInteger.ONE);
                case 3:
                    break;
                case 4:
                    Mod$$ExternalSyntheticBUOutline0.m$2("Non-terminating result of division operation. Specify decimalPrecision");
                    return null;
                case 5:
                    int ordinal = sign2.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                        } else if (bigDecimal$Companion$SignificantDecider != BigDecimal$Companion$SignificantDecider.LESS_THAN_FIVE) {
                            return bigInteger3.minus(BigInteger.ONE);
                        }
                    } else if (bigDecimal$Companion$SignificantDecider != BigDecimal$Companion$SignificantDecider.LESS_THAN_FIVE) {
                        return bigInteger3.plus(BigInteger.ONE);
                    }
                    break;
                case 6:
                    int ordinal2 = sign2.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                        } else if (bigDecimal$Companion$SignificantDecider == BigDecimal$Companion$SignificantDecider.MORE_THAN_FIVE) {
                            return bigInteger3.minus(BigInteger.ONE);
                        }
                    } else if (bigDecimal$Companion$SignificantDecider == BigDecimal$Companion$SignificantDecider.MORE_THAN_FIVE) {
                        return bigInteger3.plus(BigInteger.ONE);
                    }
                    break;
                case 7:
                    int ordinal3 = sign2.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 != 1) {
                            if (ordinal3 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                        } else if (bigDecimal$Companion$SignificantDecider == BigDecimal$Companion$SignificantDecider.MORE_THAN_FIVE) {
                            return bigInteger3.minus(BigInteger.ONE);
                        }
                    } else if (bigDecimal$Companion$SignificantDecider != BigDecimal$Companion$SignificantDecider.LESS_THAN_FIVE) {
                        return bigInteger3.plus(BigInteger.ONE);
                    }
                    break;
                case 8:
                    int ordinal4 = sign2.ordinal();
                    if (ordinal4 != 0) {
                        if (ordinal4 != 1) {
                            if (ordinal4 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                        } else if (bigDecimal$Companion$SignificantDecider != BigDecimal$Companion$SignificantDecider.LESS_THAN_FIVE) {
                            return bigInteger3.minus(BigInteger.ONE);
                        }
                    } else if (bigDecimal$Companion$SignificantDecider == BigDecimal$Companion$SignificantDecider.MORE_THAN_FIVE) {
                        return bigInteger3.plus(BigInteger.ONE);
                    }
                    break;
                case 9:
                    if (bigDecimal$Companion$SignificantDecider == BigDecimal$Companion$SignificantDecider.FIVE) {
                        BigInteger fromInt = zzd.fromInt(2);
                        if (fromInt.isZero()) {
                            JWK$$ExternalSyntheticBUOutline0.m("Division by zero! ", bigInteger, " / ", fromInt);
                            return null;
                        }
                        Sign sign4 = sign != fromInt.sign ? Sign.NEGATIVE : sign3;
                        BigInteger63Arithmetic bigInteger63Arithmetic = BigInteger.arithmetic;
                        long[] jArr3 = fromInt.magnitude;
                        bigInteger63Arithmetic.getClass();
                        long[] jArr4 = ((ULongArray) BigInteger63Arithmetic.m2116divideGR1PJdc(jArr, jArr3).second).storage;
                        if (Intrinsics.areEqual(jArr4, BigInteger63Arithmetic.ZERO)) {
                            sign4 = Sign.ZERO;
                        }
                        BigInteger bigInteger7 = new BigInteger(new BigInteger(jArr4, sign4).magnitude, sign3);
                        BigInteger bigInteger8 = BigInteger.ONE;
                        if (bigInteger7.equals(bigInteger8)) {
                            int ordinal5 = sign2.ordinal();
                            if (ordinal5 == 0) {
                                return bigInteger3.plus(bigInteger8);
                            }
                            if (ordinal5 == 1) {
                                return bigInteger3.minus(bigInteger8);
                            }
                            if (ordinal5 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                        }
                    } else if (bigDecimal$Companion$SignificantDecider == BigDecimal$Companion$SignificantDecider.MORE_THAN_FIVE) {
                        if (sign2 == sign3) {
                            bigInteger3 = bigInteger3.plus(BigInteger.ONE);
                        }
                        return sign2 == Sign.NEGATIVE ? bigInteger3.minus(BigInteger.ONE) : bigInteger3;
                    }
                    break;
                case 10:
                    if (bigDecimal$Companion$SignificantDecider == BigDecimal$Companion$SignificantDecider.FIVE) {
                        BigInteger fromInt2 = zzd.fromInt(2);
                        if (fromInt2.isZero()) {
                            JWK$$ExternalSyntheticBUOutline0.m("Division by zero! ", bigInteger, " / ", fromInt2);
                            return null;
                        }
                        if (sign != fromInt2.sign) {
                            sign3 = Sign.NEGATIVE;
                        }
                        BigInteger63Arithmetic bigInteger63Arithmetic2 = BigInteger.arithmetic;
                        long[] jArr5 = fromInt2.magnitude;
                        bigInteger63Arithmetic2.getClass();
                        long[] jArr6 = ((ULongArray) BigInteger63Arithmetic.m2116divideGR1PJdc(jArr, jArr5).second).storage;
                        if (Intrinsics.areEqual(jArr6, BigInteger63Arithmetic.ZERO)) {
                            sign3 = Sign.ZERO;
                        }
                        if (new BigInteger(jArr6, sign3).equals(bigInteger5)) {
                            int ordinal6 = sign2.ordinal();
                            if (ordinal6 == 0) {
                                return bigInteger3.plus(BigInteger.ONE);
                            }
                            if (ordinal6 == 1) {
                                return bigInteger3.minus(BigInteger.ONE);
                            }
                            if (ordinal6 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                        }
                    } else if (bigDecimal$Companion$SignificantDecider == BigDecimal$Companion$SignificantDecider.MORE_THAN_FIVE) {
                        if (sign2 == sign3) {
                            bigInteger3 = bigInteger3.plus(BigInteger.ONE);
                        }
                        return sign2 == Sign.NEGATIVE ? bigInteger3.minus(BigInteger.ONE) : bigInteger3;
                    }
                    break;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
            }
        }
        return bigInteger3;
    }

    public static BigDecimal roundSignificand(BigInteger bigInteger, long j, DecimalMode decimalMode) {
        if (bigInteger.isZero()) {
            return new BigDecimal(BigInteger.ZERO, j, decimalMode);
        }
        long numberOfDecimalDigits = bigInteger.numberOfDecimalDigits();
        boolean z = decimalMode.usingScale;
        RoundingMode roundingMode = decimalMode.roundingMode;
        long j2 = decimalMode.decimalPrecision;
        if (z) {
            j2 += decimalMode.scale;
        }
        if (j2 > numberOfDecimalDigits && !z) {
            return new BigDecimal(bigInteger.times(BigInteger.TEN.pow(j2 - numberOfDecimalDigits)), j, decimalMode);
        }
        if (j2 >= numberOfDecimalDigits) {
            return new BigDecimal(bigInteger, j, decimalMode);
        }
        BigInteger.QuotientAndRemainder divrem = bigInteger.divrem(BigInteger.TEN.pow(numberOfDecimalDigits - j2));
        BigInteger bigInteger2 = divrem.quotient;
        BigInteger bigInteger3 = divrem.remainder;
        if (Intrinsics.areEqual(bigInteger3, BigInteger.ZERO)) {
            return new BigDecimal(bigInteger2, j, decimalMode);
        }
        if (bigInteger.numberOfDecimalDigits() == bigInteger3.numberOfDecimalDigits() + bigInteger2.numberOfDecimalDigits()) {
            BigInteger roundDiscarded = roundDiscarded(bigInteger2, bigInteger3, decimalMode);
            return new BigDecimal(roundDiscarded, j + (roundDiscarded.numberOfDecimalDigits() - bigInteger2.numberOfDecimalDigits()), decimalMode);
        }
        Sign sign = bigInteger2.sign;
        if (sign == Sign.POSITIVE) {
            int ordinal = roundingMode.ordinal();
            if (ordinal != 1 && ordinal != 2) {
                return new BigDecimal(bigInteger2, j, decimalMode);
            }
            BigInteger plus = bigInteger2.plus(BigInteger.ONE);
            return new BigDecimal(plus, j + (plus.numberOfDecimalDigits() - bigInteger2.numberOfDecimalDigits()), decimalMode);
        }
        if (sign != Sign.NEGATIVE) {
            return new BigDecimal(bigInteger2, j, decimalMode);
        }
        int ordinal2 = roundingMode.ordinal();
        if (ordinal2 != 0 && ordinal2 != 2) {
            return new BigDecimal(bigInteger2, j, decimalMode);
        }
        BigInteger minus = bigInteger2.minus(BigInteger.ONE);
        return new BigDecimal(minus, j + (minus.numberOfDecimalDigits() - bigInteger2.numberOfDecimalDigits()), decimalMode);
    }

    public void Create(final BitcoinHomeWidgetViewModel bitcoinHomeWidgetViewModel, final Function1 function1, final Modifier modifier, final boolean z, Composer composer, final int i) {
        zzc zzcVar;
        BitcoinHomeWidgetViewModel bitcoinHomeWidgetViewModel2;
        final Function1 function12;
        final Modifier modifier2;
        final boolean z2;
        final int i2;
        function1.getClass();
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(307917969);
        int i3 = (gapComposer.changedInstance(bitcoinHomeWidgetViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128) | (gapComposer.changed(z) ? 2048 : 1024);
        boolean z3 = false;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            zzcVar = this;
            bitcoinHomeWidgetViewModel2 = bitcoinHomeWidgetViewModel;
            function12 = function1;
            modifier2 = modifier;
            z2 = z;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (bitcoinHomeWidgetViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, bitcoinHomeWidgetViewModel, function1, modifier, z, i, i4) { // from class: com.squareup.cash.bitcoin.views.applet.RealBitcoinHomeWidgetViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ zzc f$0;
                        public final /* synthetic */ BitcoinHomeWidgetViewModel f$1;
                        public final /* synthetic */ Function1 f$2;
                        public final /* synthetic */ Modifier f$3;
                        public final /* synthetic */ boolean f$4;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.$r8$classId) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(1);
                                    this.f$0.Create(this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, updateChangedFlags);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags2 = Updater.updateChangedFlags(1);
                                    this.f$0.Create(this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, updateChangedFlags2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            zzcVar = this;
            bitcoinHomeWidgetViewModel2 = bitcoinHomeWidgetViewModel;
            modifier2 = modifier;
            z2 = z;
            i2 = i;
            function12 = function1;
            BitcoinHomeViewKt.AddWidgetView(bitcoinHomeWidgetViewModel2, function12, modifier2, gapComposer, i3 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            if (!z2 && !(bitcoinHomeWidgetViewModel2 instanceof DependentBitcoinDisabledViewModel)) {
                z3 = true;
            }
            BitcoinHomeViewKt.AddSeparator(z3, bitcoinHomeWidgetViewModel2, gapComposer, (i3 << 3) & 112);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final BitcoinHomeWidgetViewModel bitcoinHomeWidgetViewModel3 = bitcoinHomeWidgetViewModel2;
            final zzc zzcVar2 = zzcVar;
            final int i5 = 1;
            endRestartGroup2.block = new Function2(zzcVar2, bitcoinHomeWidgetViewModel3, function12, modifier2, z2, i2, i5) { // from class: com.squareup.cash.bitcoin.views.applet.RealBitcoinHomeWidgetViewFactory$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ zzc f$0;
                public final /* synthetic */ BitcoinHomeWidgetViewModel f$1;
                public final /* synthetic */ Function1 f$2;
                public final /* synthetic */ Modifier f$3;
                public final /* synthetic */ boolean f$4;

                {
                    this.$r8$classId = i5;
                    this.f$0 = zzcVar2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.$r8$classId) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int updateChangedFlags = Updater.updateChangedFlags(1);
                            this.f$0.Create(this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, updateChangedFlags);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int updateChangedFlags2 = Updater.updateChangedFlags(1);
                            this.f$0.Create(this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, updateChangedFlags2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        Feature feature;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        zzdz zzdzVar = (zzdz) obj;
        LastLocationRequest lastLocationRequest = new LastLocationRequest(Long.MAX_VALUE, 0, false, null);
        Feature[] availableFeatures = zzdzVar.getAvailableFeatures();
        Feature feature2 = null;
        int i = 0;
        if (availableFeatures != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= availableFeatures.length) {
                    feature = null;
                    break;
                }
                feature = availableFeatures[i2];
                if ("location_updates_with_callback".equals(feature.zza)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (feature != null && feature.getVersion() >= 1) {
                com.google.android.gms.internal.location.zzu zzuVar = (com.google.android.gms.internal.location.zzu) zzdzVar.getService();
                zzee zzd = zzee.zzd(new zzde(1, taskCompletionSource));
                Parcel zza2 = zzuVar.zza();
                com.google.android.gms.internal.location.zzc.zzb(zza2, lastLocationRequest);
                com.google.android.gms.internal.location.zzc.zzb(zza2, zzd);
                zzuVar.zzc(zza2, 90);
                return;
            }
        }
        Feature[] availableFeatures2 = zzdzVar.getAvailableFeatures();
        if (availableFeatures2 != null) {
            while (true) {
                if (i >= availableFeatures2.length) {
                    break;
                }
                Feature feature3 = availableFeatures2[i];
                if ("get_last_location_with_request".equals(feature3.zza)) {
                    feature2 = feature3;
                    break;
                }
                i++;
            }
            if (feature2 != null && feature2.getVersion() >= 1) {
                com.google.android.gms.internal.location.zzu zzuVar2 = (com.google.android.gms.internal.location.zzu) zzdzVar.getService();
                zzde zzdeVar = new zzde(1, taskCompletionSource);
                Parcel zza3 = zzuVar2.zza();
                com.google.android.gms.internal.location.zzc.zzb(zza3, lastLocationRequest);
                zza3.writeStrongBinder(zzdeVar);
                zzuVar2.zzc(zza3, 82);
                return;
            }
        }
        com.google.android.gms.internal.location.zzu zzuVar3 = (com.google.android.gms.internal.location.zzu) zzdzVar.getService();
        Parcel zzb = zzuVar3.zzb(zzuVar3.zza(), 7);
        Location location = (Location) com.google.android.gms.internal.location.zzc.zza(zzb, Location.CREATOR);
        zzb.recycle();
        taskCompletionSource.setResult(location);
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public DatadogTracer build() {
        return new NoOpDatadogTracer();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString.ByteArrayCopier
    public byte[] copyFrom(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
        return System.currentTimeMillis();
    }

    @Override // com.datadog.trace.logger.Logger
    public boolean isWarnEnabled() {
        return false;
    }

    @Override // com.datadog.android.event.EventMapper
    public Object map(Object obj) {
        SpanEvent spanEvent = (SpanEvent) obj;
        spanEvent.getClass();
        return spanEvent;
    }

    @Override // com.squareup.cash.deposits.physical.presenter.address.AddressAnalyticsFactory
    public Event searchAddressEvent() {
        return new CryptoSpendSearchAddress();
    }

    @Override // com.squareup.cash.deposits.physical.presenter.address.AddressAnalyticsFactory
    public Event selectAddressEvent(boolean z) {
        return new CryptoSpendSelectAddress(Boolean.valueOf(z));
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public DatadogTracerBuilder setBundleWithRumEnabled() {
        return new zzc(2);
    }

    @Override // com.datadog.trace.logger.Logger
    public void warn(String str, Object... objArr) {
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public DatadogTracerBuilder withPartialFlushMinSpans() {
        return new zzc(2);
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public DatadogTracerBuilder withSampleRate(double d) {
        return new zzc(2);
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public DatadogTracerBuilder withServiceName(String str) {
        return new zzc(2);
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public DatadogTracerBuilder withTag(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new zzc(2);
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public DatadogTracerBuilder withTracingHeadersTypes(Set set) {
        set.getClass();
        return new zzc(2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public Object zza(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                zzvb zzvbVar = (zzvb) obj;
                Text.Symbol symbol = new Text.Symbol(zzvbVar.zza, zzvbVar.zzb, zzvbVar.zzc, zzvbVar.zzd);
                List list = zzvbVar.zzg;
                if (list == null) {
                    list = new ArrayList();
                }
                MapUtilsKt.zza(list, new zzb(0));
                return symbol;
            default:
                zzl zzlVar = (zzl) obj;
                zzf zzfVar = zzlVar.zzb;
                String str = zzlVar.zzg;
                List zzb = zzk.zzb(zzfVar);
                String str2 = zzlVar.zze;
                if (CameraPropertiesKt.zzb(str2)) {
                    str2 = "";
                }
                Rect zza2 = zzk.zza(zzb);
                if (CameraPropertiesKt.zzb(str)) {
                    str = "und";
                }
                MapUtilsKt.zza(Arrays.asList(zzlVar.zza), new e());
                float f = zzlVar.zzb.zze;
                return new Text.Line(str2, zza2, zzb, str);
        }
    }

    public /* synthetic */ zzc(int i) {
        this.$r8$classId = i;
    }

    public zzc(zzd zzdVar, InternalLogger internalLogger) {
        this.$r8$classId = 3;
        internalLogger.getClass();
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static NotVerifiableReason m2069fromValue(int i) {
        if (i == 0) {
            return NotVerifiableReason.UNSPECIFIED_REASON;
        }
        if (i == 1) {
            return NotVerifiableReason.INSTRUMENT_INELIGIBLE;
        }
        if (i == 2) {
            return NotVerifiableReason.INSTRUMENT_INACTIVE;
        }
        if (i == 3) {
            return NotVerifiableReason.INSTRUMENT_UNLINKED;
        }
        if (i == 4) {
            return NotVerifiableReason.CARD_FUNDING_TYPE_NOT_ENABLED_FOR_SUB_REGION;
        }
        if (i != 5) {
            return null;
        }
        return NotVerifiableReason.RESIDENTIAL_ADDRESS_MISSING;
    }

    public static RestrictedItemCheckRequest.PaymentMethod fromValue(int i) {
        if (i == 0) {
            return RestrictedItemCheckRequest.PaymentMethod.PAYMENT_METHOD_UNSPECIFIED;
        }
        if (i == 1) {
            return RestrictedItemCheckRequest.PaymentMethod.PAYMENT_METHOD_AFTER_PAY;
        }
        if (i == 2) {
            return RestrictedItemCheckRequest.PaymentMethod.PAYMENT_METHOD_CASH_APP_PAY;
        }
        if (i == 3) {
            return RestrictedItemCheckRequest.PaymentMethod.PAYMENT_METHOD_CASH_CARD;
        }
        if (i != 4) {
            return null;
        }
        return RestrictedItemCheckRequest.PaymentMethod.PAYMENT_METHOD_SINGLE_USE_PAYMENT;
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static ProfilePageUpsellComponentV2.IconV2 m2068fromValue(int i) {
        if (i == 0) {
            return ProfilePageUpsellComponentV2.IconV2.UNKNOWN;
        }
        if (i == 1) {
            return ProfilePageUpsellComponentV2.IconV2.VERIFYING_V2;
        }
        if (i == 2) {
            return ProfilePageUpsellComponentV2.IconV2.VERIFICATION_FAILED_V2;
        }
        if (i == 3) {
            return ProfilePageUpsellComponentV2.IconV2.FAILURE_V2;
        }
        if (i == 4) {
            return ProfilePageUpsellComponentV2.IconV2.ACTION_REQUIRED_V2;
        }
        if (i != 5) {
            return null;
        }
        return ProfilePageUpsellComponentV2.IconV2.SECURITY_CHECK_OUTLINE;
    }

    public boolean zza(Object obj, File file, File file2) {
        return true;
    }
}
