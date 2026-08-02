package com.ionspin.kotlin.bignum.integer.base63.array;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.ionspin.kotlin.bignum.integer.Quadruple;
import com.ionspin.kotlin.bignum.integer.Sextuple;
import com.ionspin.kotlin.bignum.integer.base32.BigInteger32Arithmetic;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Pair;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.collections.ArraysKt__ArraysJVMKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.UCollectionsKt___UCollectionsKt;
import kotlin.collections.unsigned.UArraysKt___UArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes4.dex */
public final class BigInteger63Arithmetic {
    public static final SignedULongArray SIGNED_POSITIVE_TWO;
    public static final long[] TWO;
    public static final BigInteger63Arithmetic INSTANCE = new BigInteger63Arithmetic();
    public static final long[] ZERO = {0};
    public static final long[] ONE = {1};
    public static final long[] TEN = {10};
    public static final ULongArray[] powersOf10 = {new ULongArray(new long[]{1}), new ULongArray(new long[]{10}), new ULongArray(new long[]{100}), new ULongArray(new long[]{1000}), new ULongArray(new long[]{10000}), new ULongArray(new long[]{100000}), new ULongArray(new long[]{1000000}), new ULongArray(new long[]{10000000}), new ULongArray(new long[]{100000000}), new ULongArray(new long[]{1000000000}), new ULongArray(new long[]{10000000000L}), new ULongArray(new long[]{100000000000L}), new ULongArray(new long[]{1000000000000L}), new ULongArray(new long[]{10000000000000L}), new ULongArray(new long[]{100000000000000L}), new ULongArray(new long[]{1000000000000000L}), new ULongArray(new long[]{10000000000000000L}), new ULongArray(new long[]{100000000000000000L}), new ULongArray(new long[]{1000000000000000000L}), new ULongArray(new long[]{776627963145224192L, 1}), new ULongArray(new long[]{7766279631452241920L, 10}), new ULongArray(new long[]{3875820019684212736L, 108}), new ULongArray(new long[]{1864712049423024128L, 1084}), new ULongArray(new long[]{200376420520689664L, 10842}), new ULongArray(new long[]{2003764205206896640L, 108420}), new ULongArray(new long[]{1590897978359414784L, 1084202}), new ULongArray(new long[]{6685607746739372032L, 10842021}), new ULongArray(new long[]{2292473209410289664L, 108420217}), new ULongArray(new long[]{4477988020393345024L, 1084202172}), new ULongArray(new long[]{7886392056514347008L, 10842021724L}), new ULongArray(new long[]{5076944270305263616L, 108420217248L}), new ULongArray(new long[]{4652582518778757120L, 1084202172485L}), new ULongArray(new long[]{408965003513692160L, 10842021724855L}), new ULongArray(new long[]{4089650035136921600L, 108420217248550L}), new ULongArray(new long[]{4003012203950112768L, 1084202172485504L}), new ULongArray(new long[]{3136633892082024448L, 10842021724855044L}), new ULongArray(new long[]{3696222810255917056L, 108420217248550443L}), new ULongArray(new long[]{68739955140067328L, 1084202172485504434L}), new ULongArray(new long[]{687399551400673280L, 1618649688000268532L, 1}), new ULongArray(new long[]{6873995514006732800L, 6963124843147909512L, 11}), new ULongArray(new long[]{4176350882083897344L, 5067644173495664471L, 117}), new ULongArray(new long[]{4870020673419870208L, 4559581550682765674L, 1175}), new ULongArray(new long[]{2583346549924823040L, 8702327359408553513L, 11754}), new ULongArray(new long[]{7386721425538678784L, 4012925262392552860L, 117549}), new ULongArray(new long[]{80237960548581376L, 3235764476506425376L, 1175494}), new ULongArray(new long[]{802379605485813760L, 4687528654499926336L, 11754943}), new ULongArray(new long[]{8023796054858137600L, 758426360725384320L, 117549435}), new ULongArray(new long[]{6450984253743169536L, 7584263607253843208L, 1175494350}), new ULongArray(new long[]{9169610316303040512L, 2055659777700225622L, 11754943508L}), new ULongArray(new long[]{8685754831337422848L, 2109853703292704613L, 117549435082L}), new ULongArray(new long[]{3847199981681246208L, 2651792959217494523L, 1175494350822L}), new ULongArray(new long[]{1578511669393358848L, 8071185518465393618L, 11754943508222L}), new ULongArray(new long[]{6561744657078812672L, 6924878889815729717L, 117549435082228L}), new ULongArray(new long[]{1053842312804696064L, 4685184640173866521L, 1175494350822287L}), new ULongArray(new long[]{1315051091192184832L, 734986217464786171L, 11754943508222875L}), new ULongArray(new long[]{3927138875067072512L, 7349862174647861711L, 117549435082228750L}), new ULongArray(new long[]{2377900603251621888L, 8935017488495186458L, 1175494350822287507L}), new ULongArray(new long[]{5332261958806667264L, 6339826553258882310L, 2531571471368099271L, 1}), new ULongArray(new long[]{7205759403792793600L, 8058033311460168257L, 6868970639971441100L, 12}), new ULongArray(new long[]{7493989779944505344L, 6793356819763476113L, 4126102141730980352L, 127}), new ULongArray(new long[]{1152921504606846976L, 3369963939651330482L, 4367533269890700295L, 1274}), new ULongArray(new long[]{2305843009213693952L, 6029523285948977397L, 6781844551487899721L, 12744}), new ULongArray(new long[]{4611686018427387904L, 4955000638361119124L, 3254841256895566560L, 127447}), new ULongArray(new long[]{0, 3433146199337312205L, 4878296458391338181L, 1274473}), new ULongArray(new long[]{0, 6661345882808794626L, 2666104399639502773L, 12744735}), new ULongArray(new long[]{0, 2049854570104515604L, 8214299922685476121L, 127447352}), new ULongArray(new long[]{0, 2051801627335604424L, 8356022932016554748L, 1274473528}), new ULongArray(new long[]{0, 2071272199646492624L, 549880988472565210L, 12744735289L}), new ULongArray(new long[]{0, 2265977922755374624L, 5498809884725652102L, 127447352890L}), new ULongArray(new long[]{0, 4213035153844194624L, 8871238662982641982L, 1274473528905L}), new ULongArray(new long[]{0, 5236863391022843008L, 5702038298133437552L, 12744735289059L}), new ULongArray(new long[]{0, 6251773725954551040L, 1680150760205720677L, 127447352890596L}), new ULongArray(new long[]{0, 7177505038416855552L, 7578135565202430968L, 1274473528905961L}), new ULongArray(new long[]{0, 7211446126185124864L, 1994379357186103223L, 12744735289059618L}), new ULongArray(new long[]{0, 7550857003867817984L, 1497049498151480621L, 127447352890596182L}), new ULongArray(new long[]{0, 1721593743839973376L, 5747122944660030410L, 1274473528905961821L}), new ULongArray(new long[]{0, 7992565401544957952L, 2130997225471649253L, 3521363252204842408L, 1}), new ULongArray(new long[]{0, 6138677720611373056L, 2863228181006940922L, 7543516411484096658L, 13}), new ULongArray(new long[]{0, 6046544984985075712L, 962165699505081802L, 1648187820002760119L, 138}), new ULongArray(new long[]{0, 5125217628722102272L, 398284958196042218L, 7258506163172825383L, 1381}), new ULongArray(new long[]{0, 5135316102947143680L, 3982849581960422185L, 8021457373744823174L, 13817}), new ULongArray(new long[]{0, 5236300845197557760L, 2935007672185118623L, 6427597442610025280L, 138178}), new ULongArray(new long[]{0, 6246148267701698560L, 1679960611286858811L, 8935742204971597955L, 1381786}), new ULongArray(new long[]{0, 7121250455888330752L, 7576234076013812308L, 6347073718022997279L, 13817869}), new ULongArray(new long[]{0, 6648900300899876864L, 1975364465299916623L, 8130504959101317950L, 138178696}), new ULongArray(new long[]{0, 1925398751015337984L, 1306900579289614621L, 7518073296174973038L, 1381786968}), new ULongArray(new long[]{0, 807243436443828224L, 3845633756041370404L, 1393756666911523917L, 13817869688L}), new ULongArray(new long[]{0, 8072434364438282240L, 1562849412994600808L, 4714194632260463366L, 138178696881L}), new ULongArray(new long[]{0, 6937367349544615936L, 6405122093091232280L, 1025086138330754621L, 1381786968815L}), new ULongArray(new long[]{0, 4810069237462728704L, 8710988709783667959L, 1027489346452770408L, 13817869688151L}), new ULongArray(new long[]{0, 1983832190353408000L, 4099538766143697323L, 1051521427672928281L, 138178696881511L}), new ULongArray(new long[]{0, 1391577829824528384L, 4101899514017870000L, 1291842239874507006L, 1381786968815111L}), new ULongArray(new long[]{0, 4692406261390508032L, 4125506992759596769L, 3695050361890294256L, 13817869688151111L}), new ULongArray(new long[]{0, 807202429631201280L, 4361581780176864463L, 57015471483839332L, 138178696881511114L}), new ULongArray(new long[]{0, 8072024296312012800L, 6722329654349541398L, 570154714838393324L, 1381786968815111140L}), new ULongArray(new long[]{0, 6933266668281921536L, 2659692285511983332L, 5701547148383933247L, 4594497651296335592L, 1}), new ULongArray(new long[]{0, 4769062424835784704L, 8150178781410281711L, 1675239262710677624L, 9051488365544252694L, 14}), new ULongArray(new long[]{0, 1573764064083968000L, 7714811519264610651L, 7529020590252000440L, 7504535323749544669L, 149}), new ULongArray(new long[]{0, 6514268603984904192L, 3361138897807900047L, 1503229607681797944L, 1258376942657240234L, 1498}), new ULongArray(new long[]{0, 579081781865611264L, 5941272867514673053L, 5808924039963203635L, 3360397389717626533L, 14981}), new ULongArray(new long[]{0, 5790817818656112640L, 4072496454018075682L, 2749008178503381508L, 5933857786611937912L, 149813})};

    public final class SignedULongArray {
        public final boolean sign;
        public final long[] unsignedValue;

        public SignedULongArray(long[] jArr, boolean z) {
            jArr.getClass();
            this.unsignedValue = jArr;
            this.sign = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignedULongArray)) {
                return false;
            }
            SignedULongArray signedULongArray = (SignedULongArray) obj;
            return Intrinsics.areEqual(this.unsignedValue, signedULongArray.unsignedValue) && this.sign == signedULongArray.sign;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.sign) + (Arrays.hashCode(this.unsignedValue) * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("SignedULongArray(unsignedValue=", "ULongArray(storage=" + Arrays.toString(this.unsignedValue) + ')', ", sign=", ")", this.sign);
        }
    }

    static {
        long[] jArr = {2};
        TWO = jArr;
        SIGNED_POSITIVE_TWO = new SignedULongArray(jArr, true);
    }

    /* renamed from: add-j68ebKY, reason: not valid java name */
    public static long[] m2109addj68ebKY(long[] jArr, long[] jArr2) {
        long[] jArr3;
        jArr.getClass();
        jArr2.getClass();
        if (m2117isZeroQwZRm1k(jArr)) {
            return jArr2;
        }
        if (m2117isZeroQwZRm1k(jArr2)) {
            return jArr;
        }
        int length = jArr.length - m2115countLeadingZeroWordsQwZRm1k(jArr);
        int length2 = jArr2.length - m2115countLeadingZeroWordsQwZRm1k(jArr2);
        Sextuple sextuple = length > length2 ? new Sextuple(Integer.valueOf(jArr.length), Integer.valueOf(jArr2.length), new ULongArray(jArr), new ULongArray(jArr2), Integer.valueOf(length), Integer.valueOf(length2)) : new Sextuple(Integer.valueOf(jArr2.length), Integer.valueOf(jArr.length), new ULongArray(jArr2), new ULongArray(jArr), Integer.valueOf(length2), Integer.valueOf(length));
        int intValue = sextuple.a.intValue();
        long[] jArr4 = sextuple.c.storage;
        long[] jArr5 = sextuple.d.storage;
        int intValue2 = sextuple.e.intValue();
        int intValue3 = sextuple.f.intValue();
        long j = jArr4[intValue2 - 1];
        ULong.Companion companion = ULong.Companion;
        int i = 0;
        boolean z = ((j & 6917529027641081856L) == 0 && (jArr5[intValue3 - 1] & 6917529027641081856L) == 0) ? false : true;
        if (z) {
            int i2 = intValue + 1;
            jArr3 = new long[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                jArr3[i3] = 0;
            }
        } else {
            jArr3 = new long[intValue];
            for (int i4 = 0; i4 < intValue; i4++) {
                jArr3[i4] = 0;
            }
        }
        if (m2117isZeroQwZRm1k(jArr)) {
            ArraysKt___ArraysJvmKt.copyInto(0, jArr, 0, jArr3, jArr.length);
        } else if (m2117isZeroQwZRm1k(jArr2)) {
            ArraysKt___ArraysJvmKt.copyInto(0, jArr2, 0, jArr3, jArr2.length);
        } else {
            int length3 = jArr.length - m2115countLeadingZeroWordsQwZRm1k(jArr);
            int length4 = jArr2.length - m2115countLeadingZeroWordsQwZRm1k(jArr2);
            Sextuple sextuple2 = length3 > length4 ? new Sextuple(Integer.valueOf(jArr.length), Integer.valueOf(jArr2.length), new ULongArray(jArr), new ULongArray(jArr2), Integer.valueOf(length3), Integer.valueOf(length4)) : new Sextuple(Integer.valueOf(jArr2.length), Integer.valueOf(jArr.length), new ULongArray(jArr2), new ULongArray(jArr), Integer.valueOf(length4), Integer.valueOf(length3));
            int intValue4 = sextuple2.a.intValue();
            long[] jArr6 = sextuple2.c.storage;
            long[] jArr7 = sextuple2.d.storage;
            int intValue5 = sextuple2.e.intValue();
            int intValue6 = sextuple2.f.intValue();
            long j2 = 0;
            while (i < intValue6) {
                long j3 = jArr6[i];
                ULong.Companion companion2 = ULong.Companion;
                long j4 = j2 + j3 + jArr7[i];
                jArr3[i] = Long.MAX_VALUE & j4;
                j2 = j4 >>> 63;
                i++;
            }
            while (true) {
                if (j2 == 0) {
                    while (i < intValue5) {
                        long j5 = jArr6[i];
                        ULong.Companion companion3 = ULong.Companion;
                        jArr3[i] = j5;
                        i++;
                    }
                } else {
                    if (i == intValue4) {
                        jArr3[intValue4] = j2;
                        break;
                    }
                    long j6 = jArr6[i];
                    ULong.Companion companion4 = ULong.Companion;
                    long j7 = j2 + j6;
                    jArr3[i] = j7 & Long.MAX_VALUE;
                    j2 = j7 >>> 63;
                    i++;
                }
            }
        }
        return z ? m2121removeLeadingZerosJIhQxVY(jArr3) : jArr3;
    }

    /* renamed from: and-SIFponk$bignum, reason: not valid java name */
    public static SignedULongArray m2110andSIFponk$bignum(SignedULongArray signedULongArray, long[] jArr) {
        long[] jArr2 = signedULongArray.unsignedValue;
        jArr2.getClass();
        Pair pair = jArr2.length > jArr.length ? new Pair(new ULongArray(jArr2), new ULongArray(jArr)) : new Pair(new ULongArray(jArr), new ULongArray(jArr2));
        ((ULongArray) pair.first).getClass();
        int length = ((ULongArray) pair.second).storage.length;
        long[] jArr3 = new long[length];
        for (int i = 0; i < length; i++) {
            long j = jArr2[i];
            ULong.Companion companion = ULong.Companion;
            jArr3[i] = j & jArr[i];
        }
        return new SignedULongArray(jArr3, signedULongArray.sign);
    }

    /* renamed from: baseMultiplyWithCorrectedSize-_EW1lsA, reason: not valid java name */
    public static long[] m2111baseMultiplyWithCorrectedSize_EW1lsA(long j, long[] jArr, int i) {
        jArr.getClass();
        long j2 = j & BodyPartID.bodyIdMax;
        ULong.Companion companion = ULong.Companion;
        long j3 = j >>> 32;
        int m2119numberOfLeadingZerosInAWordVKZWuLQ = (63 - m2119numberOfLeadingZerosInAWordVKZWuLQ(j)) + m2112bitLengthQwZRm1k(jArr);
        long[] jArr2 = new long[m2119numberOfLeadingZerosInAWordVKZWuLQ % 63 != 0 ? (m2119numberOfLeadingZerosInAWordVKZWuLQ / 63) + 1 : m2119numberOfLeadingZerosInAWordVKZWuLQ / 63];
        int i2 = 0;
        int i3 = 0;
        long j4 = 0;
        while (i2 < i) {
            long j5 = jArr[i2];
            ULong.Companion companion2 = ULong.Companion;
            long j6 = j5 & BodyPartID.bodyIdMax;
            long j7 = j5 >>> 32;
            i2++;
            long j8 = j6 * j2;
            long j9 = j4 + (j8 & Long.MAX_VALUE);
            long j10 = (j8 >>> 63) + (j9 >>> 63);
            long j11 = (j2 * j7) + (j6 * j3);
            long j12 = (j9 & Long.MAX_VALUE) + ((j11 << 32) & Long.MAX_VALUE);
            jArr2[i3] = j12 & Long.MAX_VALUE;
            j4 = j10 + (j11 >>> 31) + (j12 >>> 63) + ((j7 * j3) << 1);
            i3++;
        }
        if (j4 != 0) {
            jArr2[i3] = j4;
        }
        return jArr2;
    }

    /* renamed from: bitLength-QwZRm1k, reason: not valid java name */
    public static int m2112bitLengthQwZRm1k(long[] jArr) {
        jArr.getClass();
        if (m2117isZeroQwZRm1k(jArr)) {
            return 0;
        }
        int length = (jArr.length - m2115countLeadingZeroWordsQwZRm1k(jArr)) - 1;
        long j = jArr[length];
        ULong.Companion companion = ULong.Companion;
        return (length * 63) + (63 - m2119numberOfLeadingZerosInAWordVKZWuLQ(j));
    }

    /* renamed from: compare-GR1PJdc, reason: not valid java name */
    public static int m2113compareGR1PJdc(long[] jArr, long[] jArr2) {
        jArr.getClass();
        jArr2.getClass();
        return m2114compareWithStartIndexesMccmUSY(jArr, jArr.length - m2115countLeadingZeroWordsQwZRm1k(jArr), jArr2, jArr2.length - m2115countLeadingZeroWordsQwZRm1k(jArr2));
    }

    /* renamed from: compareWithStartIndexes-MccmUSY, reason: not valid java name */
    public static int m2114compareWithStartIndexesMccmUSY(long[] jArr, int i, long[] jArr2, int i2) {
        boolean z;
        boolean z2;
        jArr.getClass();
        jArr2.getClass();
        if (i <= i2) {
            if (i2 > i) {
                return -1;
            }
            int i3 = i - 1;
            while (true) {
                if (i3 < 0) {
                    z = false;
                    z2 = true;
                    break;
                }
                long j = jArr[i3];
                ULong.Companion companion = ULong.Companion;
                if (Long.compareUnsigned(j, jArr2[i3]) > 0) {
                    z2 = false;
                    z = true;
                    break;
                }
                if (Long.compareUnsigned(jArr[i3], jArr2[i3]) < 0) {
                    z2 = false;
                    z = false;
                    break;
                }
                i3--;
            }
            if (z2) {
                return 0;
            }
            if (!z) {
                return -1;
            }
        }
        return 1;
    }

    /* renamed from: countLeadingZeroWords-QwZRm1k, reason: not valid java name */
    public static int m2115countLeadingZeroWordsQwZRm1k(long[] jArr) {
        jArr.getClass();
        int length = jArr.length - 1;
        if (length <= 0) {
            return 0;
        }
        long j = jArr[length];
        ULong.Companion companion = ULong.Companion;
        while (j == 0 && length > 0) {
            length--;
            j = jArr[length];
            ULong.Companion companion2 = ULong.Companion;
        }
        long j2 = jArr[length];
        ULong.Companion companion3 = ULong.Companion;
        if (j2 == 0) {
            length--;
        }
        return (jArr.length - length) - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x051e A[LOOP:1: B:37:0x0518->B:39:0x051e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03d3  */
    /* renamed from: divide-GR1PJdc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair m2116divideGR1PJdc(long[] jArr, long[] jArr2) {
        long j;
        long[] jArr3;
        long j2;
        long[] jArr4;
        int i;
        Pair pair;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int[] iArr2;
        long[] jArr5;
        int i5;
        long[] jArr6;
        long j3;
        long[] m2122shlGERUpyg$bignum;
        jArr.getClass();
        jArr2.getClass();
        int m2113compareGR1PJdc = m2113compareGR1PJdc(jArr2, jArr);
        long[] jArr7 = ZERO;
        if (m2113compareGR1PJdc > 0) {
            return new Pair(new ULongArray(jArr7), new ULongArray(jArr));
        }
        int i6 = 0;
        int i7 = 1;
        if (jArr2.length == 1 && jArr.length == 1) {
            long j4 = jArr[0];
            ULong.Companion companion = ULong.Companion;
            return new Pair(new ULongArray(m2121removeLeadingZerosJIhQxVY(new long[]{Long.divideUnsigned(j4, jArr2[0])})), new ULongArray(m2121removeLeadingZerosJIhQxVY(new long[]{Long.remainderUnsigned(jArr[0], jArr2[0])})));
        }
        if (m2112bitLengthQwZRm1k(jArr) - m2112bitLengthQwZRm1k(jArr2) == 0) {
            return new Pair(new ULongArray(ONE), new ULongArray(m2124subtractj68ebKY(jArr, jArr2)));
        }
        long j5 = jArr2[jArr2.length - 1];
        ULong.Companion companion2 = ULong.Companion;
        int m2119numberOfLeadingZerosInAWordVKZWuLQ = m2119numberOfLeadingZerosInAWordVKZWuLQ(j5);
        long[] m2122shlGERUpyg$bignum2 = m2122shlGERUpyg$bignum(jArr2, m2119numberOfLeadingZerosInAWordVKZWuLQ);
        long[] m2122shlGERUpyg$bignum3 = m2122shlGERUpyg$bignum(jArr, m2119numberOfLeadingZerosInAWordVKZWuLQ);
        int length = m2122shlGERUpyg$bignum3.length;
        int length2 = m2122shlGERUpyg$bignum2.length;
        int length3 = m2122shlGERUpyg$bignum2.length - m2115countLeadingZeroWordsQwZRm1k(m2122shlGERUpyg$bignum2);
        int i8 = length - length2;
        long[] jArr8 = new long[i8];
        long[] m2122shlGERUpyg$bignum4 = m2122shlGERUpyg$bignum(m2122shlGERUpyg$bignum2, i8 * 63);
        long j6 = 1;
        if (m2113compareGR1PJdc(m2122shlGERUpyg$bignum3, m2122shlGERUpyg$bignum4) >= 0) {
            jArr8 = new long[i8 + 1];
            jArr8[i8] = 1;
            m2122shlGERUpyg$bignum3 = m2124subtractj68ebKY(m2122shlGERUpyg$bignum3, m2122shlGERUpyg$bignum4);
        }
        int i9 = i8 - 1;
        while (-1 < i9) {
            int i10 = length2 + i9;
            if (i10 < m2122shlGERUpyg$bignum3.length) {
                long j7 = m2122shlGERUpyg$bignum3[i10];
                ULong.Companion companion3 = ULong.Companion;
                j = j6;
                long[] jArr9 = new long[i7];
                jArr9[i6] = j7;
                long[] m2122shlGERUpyg$bignum5 = m2122shlGERUpyg$bignum(jArr9, 63);
                long j8 = m2122shlGERUpyg$bignum3[i10 - 1];
                long[] jArr10 = new long[i7];
                jArr10[i6] = j8;
                jArr3 = m2109addj68ebKY(m2122shlGERUpyg$bignum5, jArr10);
            } else {
                j = j6;
                if (i10 == m2122shlGERUpyg$bignum3.length) {
                    long[] jArr11 = new long[i7];
                    long j9 = m2122shlGERUpyg$bignum3[i10 - 1];
                    ULong.Companion companion4 = ULong.Companion;
                    jArr11[i6] = j9;
                    jArr3 = jArr11;
                } else {
                    jArr3 = jArr7;
                }
            }
            int[] m2126to32BitkqpWZOw$bignum = m2126to32BitkqpWZOw$bignum(jArr3);
            long j10 = m2122shlGERUpyg$bignum2[length2 - 1];
            ULong.Companion companion5 = ULong.Companion;
            long[] jArr12 = new long[i7];
            jArr12[i6] = j10;
            int[] m2126to32BitkqpWZOw$bignum2 = m2126to32BitkqpWZOw$bignum(jArr12);
            int m2102compareYnv0uTE = BigInteger32Arithmetic.m2102compareYnv0uTE(m2126to32BitkqpWZOw$bignum2, m2126to32BitkqpWZOw$bignum);
            int[] iArr3 = BigInteger32Arithmetic.ZERO;
            if (m2102compareYnv0uTE > 0) {
                pair = new Pair(new UIntArray(iArr3), new UIntArray(m2126to32BitkqpWZOw$bignum));
            } else if (m2126to32BitkqpWZOw$bignum2.length == i7 && m2126to32BitkqpWZOw$bignum.length == i7) {
                int i11 = m2126to32BitkqpWZOw$bignum[i6];
                UInt.Companion companion6 = UInt.Companion;
                pair = new Pair(new UIntArray(BigInteger32Arithmetic.m2106removeLeadingZeroshkIa6DI(new int[]{Integer.divideUnsigned(i11, m2126to32BitkqpWZOw$bignum2[i6])})), new UIntArray(BigInteger32Arithmetic.m2106removeLeadingZeroshkIa6DI(new int[]{Integer.remainderUnsigned(m2126to32BitkqpWZOw$bignum[i6], m2126to32BitkqpWZOw$bignum2[i6])})));
            } else if (BigInteger32Arithmetic.m2101bitLengthajY9A(m2126to32BitkqpWZOw$bignum) - BigInteger32Arithmetic.m2101bitLengthajY9A(m2126to32BitkqpWZOw$bignum2) == 0) {
                pair = new Pair(new UIntArray(new int[]{i7}), new UIntArray(BigInteger32Arithmetic.m2104minus00sMy4$bignum(m2126to32BitkqpWZOw$bignum, m2126to32BitkqpWZOw$bignum2)));
            } else {
                int i12 = m2126to32BitkqpWZOw$bignum2[m2126to32BitkqpWZOw$bignum2.length - i7];
                UInt.Companion companion7 = UInt.Companion;
                int m2105numberOfLeadingZerosInAWordWZ4Q5Ns = BigInteger32Arithmetic.m2105numberOfLeadingZerosInAWordWZ4Q5Ns(i12);
                int[] m2107shlWj2uyrI$bignum = BigInteger32Arithmetic.m2107shlWj2uyrI$bignum(m2105numberOfLeadingZerosInAWordWZ4Q5Ns, m2126to32BitkqpWZOw$bignum2);
                int[] m2107shlWj2uyrI$bignum2 = BigInteger32Arithmetic.m2107shlWj2uyrI$bignum(m2105numberOfLeadingZerosInAWordWZ4Q5Ns, m2126to32BitkqpWZOw$bignum);
                j2 = BodyPartID.bodyIdMax;
                int length4 = m2107shlWj2uyrI$bignum2.length;
                int i13 = i6;
                int length5 = m2107shlWj2uyrI$bignum.length;
                int i14 = length4 - length5;
                int i15 = i7;
                int[] iArr4 = new int[i14];
                int[] m2107shlWj2uyrI$bignum3 = BigInteger32Arithmetic.m2107shlWj2uyrI$bignum(i14 * 32, m2107shlWj2uyrI$bignum);
                if (BigInteger32Arithmetic.m2102compareYnv0uTE(m2107shlWj2uyrI$bignum2, m2107shlWj2uyrI$bignum3) >= 0) {
                    iArr4 = new int[i14 + 1];
                    iArr4[i14] = i15;
                    m2107shlWj2uyrI$bignum2 = BigInteger32Arithmetic.m2104minus00sMy4$bignum(m2107shlWj2uyrI$bignum2, m2107shlWj2uyrI$bignum3);
                }
                int i16 = i14 - 1;
                while (true) {
                    long j11 = 0;
                    if (-1 >= i16) {
                        break;
                    }
                    int i17 = length5 + i16;
                    long[] jArr13 = jArr7;
                    if (i17 < m2107shlWj2uyrI$bignum2.length) {
                        int i18 = m2107shlWj2uyrI$bignum2[i17];
                        UInt.Companion companion8 = UInt.Companion;
                        i3 = length5;
                        long j12 = i18 & BodyPartID.bodyIdMax;
                        ULong.Companion companion9 = ULong.Companion;
                        iArr = iArr4;
                        i4 = i9;
                        j11 = Long.divideUnsigned((j12 << 32) + (m2107shlWj2uyrI$bignum2[i17 - 1] & BodyPartID.bodyIdMax), m2107shlWj2uyrI$bignum[i3 - 1] & BodyPartID.bodyIdMax);
                    } else {
                        i3 = length5;
                        iArr = iArr4;
                        i4 = i9;
                        if (i17 == m2107shlWj2uyrI$bignum2.length) {
                            int i19 = m2107shlWj2uyrI$bignum2[i17 - 1];
                            UInt.Companion companion10 = UInt.Companion;
                            j11 = Integer.divideUnsigned(i19, m2107shlWj2uyrI$bignum[i3 - 1]) & BodyPartID.bodyIdMax;
                            ULong.Companion companion11 = ULong.Companion;
                        }
                    }
                    long j13 = j11;
                    ULong.Companion companion12 = ULong.Companion;
                    int i20 = Long.compareUnsigned(j13, 4294967294L) < 0 ? (int) j13 : -2;
                    iArr[i16] = i20;
                    UInt.Companion companion13 = UInt.Companion;
                    int i21 = i16 * 32;
                    int[] m2107shlWj2uyrI$bignum4 = BigInteger32Arithmetic.m2107shlWj2uyrI$bignum(i21, BigInteger32Arithmetic.m2108timesFE_7wA8$bignum(i20, m2107shlWj2uyrI$bignum));
                    while (BigInteger32Arithmetic.m2102compareYnv0uTE(m2107shlWj2uyrI$bignum4, m2107shlWj2uyrI$bignum2) > 0) {
                        int i22 = iArr[i16];
                        UInt.Companion companion14 = UInt.Companion;
                        int i23 = i22 - 1;
                        iArr[i16] = i23;
                        m2107shlWj2uyrI$bignum4 = BigInteger32Arithmetic.m2107shlWj2uyrI$bignum(i21, BigInteger32Arithmetic.m2108timesFE_7wA8$bignum(i23, m2107shlWj2uyrI$bignum));
                    }
                    m2107shlWj2uyrI$bignum2 = BigInteger32Arithmetic.m2104minus00sMy4$bignum(m2107shlWj2uyrI$bignum2, m2107shlWj2uyrI$bignum4);
                    i16--;
                    jArr7 = jArr13;
                    length5 = i3;
                    i9 = i4;
                    iArr4 = iArr;
                }
                jArr4 = jArr7;
                i = i9;
                while (BigInteger32Arithmetic.m2102compareYnv0uTE(m2107shlWj2uyrI$bignum2, m2107shlWj2uyrI$bignum) >= 0) {
                    Integer valueOf = Integer.valueOf(i15);
                    int i24 = i15;
                    int[] iArr5 = new int[i24];
                    iArr5[i13] = i24;
                    if (iArr4.length == i24) {
                        int i25 = iArr4[i13];
                        UInt.Companion companion15 = UInt.Companion;
                        if (i25 == 0) {
                            iArr4 = iArr5;
                            m2107shlWj2uyrI$bignum2 = BigInteger32Arithmetic.m2104minus00sMy4$bignum(m2107shlWj2uyrI$bignum2, m2107shlWj2uyrI$bignum);
                            i13 = 0;
                            i15 = 1;
                        }
                    }
                    UInt.Companion companion16 = UInt.Companion;
                    Quadruple quadruple = iArr4.length > i24 ? new Quadruple(Integer.valueOf(iArr4.length), valueOf, new UIntArray(iArr4), new UIntArray(iArr5)) : new Quadruple(valueOf, Integer.valueOf(iArr4.length), new UIntArray(iArr5), new UIntArray(iArr4));
                    int intValue = ((Number) quadruple.a).intValue();
                    int[] iArr6 = ((UIntArray) quadruple.c).storage;
                    int[] iArr7 = ((UIntArray) quadruple.d).storage;
                    int i26 = intValue + 1;
                    int[] iArr8 = new int[i26];
                    for (int i27 = i13; i27 < i26; i27++) {
                        iArr8[i27] = i13;
                    }
                    int i28 = i13;
                    long j14 = 0;
                    for (int intValue2 = ((Number) quadruple.b).intValue(); i28 < intValue2; intValue2 = intValue2) {
                        int i29 = iArr6[i28];
                        UInt.Companion companion17 = UInt.Companion;
                        int i30 = i28;
                        long j15 = i29 & BodyPartID.bodyIdMax;
                        ULong.Companion companion18 = ULong.Companion;
                        long j16 = j14 + j15 + (iArr7[i30] & BodyPartID.bodyIdMax);
                        iArr8[i30] = (int) (j16 & BodyPartID.bodyIdMax);
                        j14 = j16 >>> 32;
                        i28 = i30 + 1;
                    }
                    long j17 = j14;
                    while (true) {
                        if (j17 == 0) {
                            while (i28 < intValue) {
                                int i31 = iArr6[i28];
                                UInt.Companion companion19 = UInt.Companion;
                                iArr8[i28] = i31;
                                i28++;
                            }
                            int i32 = iArr8[intValue];
                            UInt.Companion companion20 = UInt.Companion;
                            if (i32 == 0) {
                                iArr4 = ArraysKt___ArraysJvmKt.copyOfRange(iArr8, i13, intValue);
                            }
                        } else {
                            if (i28 == intValue) {
                                int i33 = (int) j17;
                                UInt.Companion companion21 = UInt.Companion;
                                iArr8[intValue] = i33;
                                break;
                            }
                            int i34 = intValue;
                            int i35 = iArr6[i28];
                            UInt.Companion companion22 = UInt.Companion;
                            int i36 = i28;
                            long j18 = i35 & BodyPartID.bodyIdMax;
                            ULong.Companion companion23 = ULong.Companion;
                            long j19 = j17 + j18;
                            iArr8[i36] = (int) (j19 & BodyPartID.bodyIdMax);
                            j17 = j19 >>> 32;
                            i28 = i36 + 1;
                            intValue = i34;
                            i13 = 0;
                        }
                    }
                    iArr4 = iArr8;
                    m2107shlWj2uyrI$bignum2 = BigInteger32Arithmetic.m2104minus00sMy4$bignum(m2107shlWj2uyrI$bignum2, m2107shlWj2uyrI$bignum);
                    i13 = 0;
                    i15 = 1;
                }
                if (m2107shlWj2uyrI$bignum2.length == 0 || m2105numberOfLeadingZerosInAWordWZ4Q5Ns == 0) {
                    iArr3 = m2107shlWj2uyrI$bignum2;
                } else {
                    int i37 = m2105numberOfLeadingZerosInAWordWZ4Q5Ns % 32;
                    int i38 = m2105numberOfLeadingZerosInAWordWZ4Q5Ns / 32;
                    if (i38 < m2107shlWj2uyrI$bignum2.length) {
                        if (i37 == 0) {
                            iArr3 = ArraysKt___ArraysJvmKt.copyOfRange(m2107shlWj2uyrI$bignum2, i38, m2107shlWj2uyrI$bignum2.length);
                        } else if (m2107shlWj2uyrI$bignum2.length <= 1 || m2107shlWj2uyrI$bignum2.length - i38 != 1) {
                            int length6 = m2107shlWj2uyrI$bignum2.length - i38;
                            int[] iArr9 = new int[length6];
                            for (int i39 = 0; i39 < length6; i39++) {
                                if (i39 >= 0 && i39 < (m2107shlWj2uyrI$bignum2.length - 1) - i38) {
                                    int i40 = i39 + i38;
                                    int i41 = m2107shlWj2uyrI$bignum2[i40];
                                    UInt.Companion companion24 = UInt.Companion;
                                    i2 = (m2107shlWj2uyrI$bignum2[i40 + 1] << (32 - i37)) | (i41 >>> i37);
                                    iArr9[i39] = i2;
                                }
                                if (i39 != (m2107shlWj2uyrI$bignum2.length - 1) - i38) {
                                    OptionalProvider$$ExternalSyntheticLambda0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i39, "Invalid case "));
                                    return null;
                                }
                                int i42 = m2107shlWj2uyrI$bignum2[i39 + i38];
                                UInt.Companion companion25 = UInt.Companion;
                                i2 = i42 >>> i37;
                                iArr9[i39] = i2;
                            }
                            iArr3 = BigInteger32Arithmetic.m2106removeLeadingZeroshkIa6DI(iArr9);
                        } else {
                            int i43 = m2107shlWj2uyrI$bignum2[m2107shlWj2uyrI$bignum2.length - 1];
                            UInt.Companion companion26 = UInt.Companion;
                            iArr3 = new int[]{i43 >>> i37};
                        }
                    }
                }
                pair = new Pair(new UIntArray(BigInteger32Arithmetic.m2106removeLeadingZeroshkIa6DI(iArr4)), new UIntArray(iArr3));
                iArr2 = ((UIntArray) pair.first).storage;
                if (iArr2.length != 0) {
                    jArr5 = jArr4;
                } else if (iArr2.length == 1) {
                    int i44 = iArr2[0];
                    UInt.Companion companion27 = UInt.Companion;
                    ULong.Companion companion28 = ULong.Companion;
                    jArr5 = new long[]{i44 & j2};
                } else {
                    int m2101bitLengthajY9A = BigInteger32Arithmetic.m2101bitLengthajY9A(iArr2);
                    int i45 = m2101bitLengthajY9A % 63 == 0 ? m2101bitLengthajY9A / 63 : (m2101bitLengthajY9A / 63) + 1;
                    jArr5 = new long[i45];
                    int i46 = 0;
                    while (i46 < i45) {
                        int i47 = i46 % 32;
                        int i48 = (i46 * 2) - (i46 / 32);
                        if (i45 == 2) {
                            int i49 = iArr2[0];
                            UInt.Companion companion29 = UInt.Companion;
                            ULong.Companion companion30 = ULong.Companion;
                            long j20 = iArr2[1] & j2;
                            jArr5[0] = (i49 & j2) | ((j20 << 32) & 9223372032559808512L);
                            if (iArr2.length == 4) {
                                jArr5[1] = (j20 >>> 31) | ((iArr2[2] & j2) << 1) | ((iArr2[3] & j2) << 33);
                            } else if (iArr2.length > 2) {
                                jArr5[1] = (j20 >>> 31) | ((iArr2[2] & j2) << 1);
                            } else {
                                jArr5[1] = j20 >>> 31;
                            }
                        } else if (i46 == 0) {
                            int i50 = iArr2[0];
                            UInt.Companion companion31 = UInt.Companion;
                            ULong.Companion companion32 = ULong.Companion;
                            jArr5[i46] = (i50 & j2) | (((iArr2[1] & j2) << 32) & 9223372032559808512L);
                        } else {
                            if (1 > i46 || i46 >= i45 - 1) {
                                i5 = i45;
                                jArr6 = jArr5;
                                if (i46 == i5 - 1) {
                                    if (i48 < iArr2.length) {
                                        int i51 = iArr2[i48 - 1];
                                        UInt.Companion companion33 = UInt.Companion;
                                        ULong.Companion companion34 = ULong.Companion;
                                        jArr6[i46] = ((i51 & j2) >>> (32 - i47)) | ((iArr2[i48] & j2) << i47);
                                    } else {
                                        int i52 = iArr2[i48 - 1];
                                        UInt.Companion companion35 = UInt.Companion;
                                        ULong.Companion companion36 = ULong.Companion;
                                        jArr6[i46] = (i52 & j2) >>> (32 - i47);
                                    }
                                }
                            } else {
                                int i53 = iArr2[i48 - 1];
                                UInt.Companion companion37 = UInt.Companion;
                                long j21 = i53 & j2;
                                ULong.Companion companion38 = ULong.Companion;
                                i5 = i45;
                                jArr6 = jArr5;
                                jArr6[i46] = ((iArr2[i48] & j2) << i47) | (j21 >>> (32 - i47)) | (((iArr2[i48 + 1] & j2) << (i47 + 32)) & 9223372032559808512L);
                            }
                            i46++;
                            i45 = i5;
                            jArr5 = jArr6;
                        }
                        i5 = i45;
                        jArr6 = jArr5;
                        i46++;
                        i45 = i5;
                        jArr5 = jArr6;
                    }
                }
                if (m2113compareGR1PJdc(jArr5, new long[]{9223372036854775806L}) >= 0) {
                    j3 = jArr5[0];
                    ULong.Companion companion39 = ULong.Companion;
                } else {
                    j3 = Long.MAX_VALUE;
                }
                jArr8[i] = j3;
                ULong.Companion companion40 = ULong.Companion;
                int i54 = i * 63;
                m2122shlGERUpyg$bignum = m2122shlGERUpyg$bignum(m2111baseMultiplyWithCorrectedSize_EW1lsA(j3, m2122shlGERUpyg$bignum2, length3), i54);
                while (m2113compareGR1PJdc(m2122shlGERUpyg$bignum, m2122shlGERUpyg$bignum3) > 0) {
                    long j22 = jArr8[i];
                    ULong.Companion companion41 = ULong.Companion;
                    long j23 = j22 - j;
                    jArr8[i] = j23;
                    m2122shlGERUpyg$bignum = m2122shlGERUpyg$bignum(m2111baseMultiplyWithCorrectedSize_EW1lsA(j23, m2122shlGERUpyg$bignum2, length3), i54);
                }
                m2122shlGERUpyg$bignum3 = m2124subtractj68ebKY(m2122shlGERUpyg$bignum3, m2122shlGERUpyg$bignum);
                i9 = i - 1;
                j6 = j;
                jArr7 = jArr4;
                i6 = 0;
                i7 = 1;
            }
            jArr4 = jArr7;
            i = i9;
            j2 = BodyPartID.bodyIdMax;
            iArr2 = ((UIntArray) pair.first).storage;
            if (iArr2.length != 0) {
            }
            if (m2113compareGR1PJdc(jArr5, new long[]{9223372036854775806L}) >= 0) {
            }
            jArr8[i] = j3;
            ULong.Companion companion402 = ULong.Companion;
            int i542 = i * 63;
            m2122shlGERUpyg$bignum = m2122shlGERUpyg$bignum(m2111baseMultiplyWithCorrectedSize_EW1lsA(j3, m2122shlGERUpyg$bignum2, length3), i542);
            while (m2113compareGR1PJdc(m2122shlGERUpyg$bignum, m2122shlGERUpyg$bignum3) > 0) {
            }
            m2122shlGERUpyg$bignum3 = m2124subtractj68ebKY(m2122shlGERUpyg$bignum3, m2122shlGERUpyg$bignum);
            i9 = i - 1;
            j6 = j;
            jArr7 = jArr4;
            i6 = 0;
            i7 = 1;
        }
        long j24 = j6;
        while (m2113compareGR1PJdc(m2122shlGERUpyg$bignum3, m2122shlGERUpyg$bignum2) >= 0) {
            jArr8 = m2109addj68ebKY(jArr8, new long[]{j24});
            m2122shlGERUpyg$bignum3 = m2124subtractj68ebKY(m2122shlGERUpyg$bignum3, m2122shlGERUpyg$bignum2);
        }
        return new Pair(new ULongArray(m2121removeLeadingZerosJIhQxVY(jArr8)), new ULongArray(m2123shrGERUpyg$bignum(m2122shlGERUpyg$bignum3, m2119numberOfLeadingZerosInAWordVKZWuLQ)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r3 == 0) goto L12;
     */
    /* renamed from: isZero-QwZRm1k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2117isZeroQwZRm1k(long[] jArr) {
        if (!Intrinsics.areEqual(jArr, ZERO)) {
            if (jArr.length == 1) {
                long j = jArr[0];
                ULong.Companion companion = ULong.Companion;
            }
            if (jArr.length - m2115countLeadingZeroWordsQwZRm1k(jArr) != 0) {
                return false;
            }
        }
        return true;
    }

    public static SignedULongArray minus$bignum(SignedULongArray signedULongArray, SignedULongArray signedULongArray2) {
        boolean z = !signedULongArray2.sign;
        long[] jArr = signedULongArray2.unsignedValue;
        jArr.getClass();
        boolean z2 = signedULongArray.sign;
        boolean z3 = z2 ^ z;
        long[] jArr2 = signedULongArray.unsignedValue;
        if (z3) {
            jArr2.getClass();
            return m2113compareGR1PJdc(jArr2, jArr) > 0 ? new SignedULongArray(m2124subtractj68ebKY(jArr2, jArr), z2) : new SignedULongArray(m2124subtractj68ebKY(jArr, jArr2), z);
        }
        jArr2.getClass();
        return new SignedULongArray(m2109addj68ebKY(jArr2, jArr), z2);
    }

    /* renamed from: multiply-j68ebKY, reason: not valid java name */
    public static long[] m2118multiplyj68ebKY(long[] jArr, long[] jArr2) {
        Collection uLongArray;
        Collection uLongArray2;
        Pair pair;
        long j;
        SignedULongArray signedULongArray;
        long j2;
        jArr.getClass();
        jArr2.getClass();
        int length = jArr.length - m2115countLeadingZeroWordsQwZRm1k(jArr);
        int length2 = jArr2.length - m2115countLeadingZeroWordsQwZRm1k(jArr2);
        boolean m2117isZeroQwZRm1k = m2117isZeroQwZRm1k(jArr);
        long[] jArr3 = ZERO;
        if (m2117isZeroQwZRm1k || m2117isZeroQwZRm1k(jArr2)) {
            return jArr3;
        }
        int i = 0;
        if ((length >= 120 || length2 >= 120) && (length <= 15000 || length2 < 15000)) {
            SignedULongArray signedULongArray2 = new SignedULongArray(jArr, true);
            SignedULongArray signedULongArray3 = new SignedULongArray(jArr2, true);
            int max = (Math.max(length, length2) + 1) / 2;
            int i2 = max * 63;
            long[] m2124subtractj68ebKY = m2124subtractj68ebKY(m2122shlGERUpyg$bignum(ONE, i2), new long[]{1});
            SignedULongArray m2110andSIFponk$bignum = m2110andSIFponk$bignum(signedULongArray2, m2124subtractj68ebKY);
            SignedULongArray shr$bignum = shr$bignum(signedULongArray2, i2);
            SignedULongArray m2110andSIFponk$bignum2 = m2110andSIFponk$bignum(signedULongArray3, m2124subtractj68ebKY);
            SignedULongArray shr$bignum2 = shr$bignum(signedULongArray3, i2);
            SignedULongArray times$bignum = times$bignum(shr$bignum, shr$bignum2);
            SignedULongArray times$bignum2 = times$bignum(m2110andSIFponk$bignum, m2110andSIFponk$bignum2);
            return signedAdd(signedAdd(shl$bignum(times$bignum, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE * max), shl$bignum(minus$bignum(minus$bignum(times$bignum(signedAdd(shr$bignum, m2110andSIFponk$bignum), signedAdd(shr$bignum2, m2110andSIFponk$bignum2)), times$bignum), times$bignum2), i2)), times$bignum2).unsignedValue;
        }
        if (length < 15000 || length2 < 15000) {
            int length3 = jArr2.length;
            long[] jArr4 = jArr3;
            int i3 = 0;
            while (i < length3) {
                long j3 = jArr2[i];
                ULong.Companion companion = ULong.Companion;
                int i4 = i3 + 1;
                if (i3 <= length2) {
                    long[] m2122shlGERUpyg$bignum = m2122shlGERUpyg$bignum(m2111baseMultiplyWithCorrectedSize_EW1lsA(j3, jArr, jArr.length - m2115countLeadingZeroWordsQwZRm1k(jArr)), i3 * 63);
                    jArr4.getClass();
                    jArr4 = m2109addj68ebKY(jArr4, m2122shlGERUpyg$bignum);
                }
                i++;
                i3 = i4;
            }
            return jArr4;
        }
        if (jArr.length % 3 != 0) {
            ULongArray uLongArray3 = new ULongArray(jArr);
            int length4 = (((jArr.length + 2) / 3) * 3) - jArr.length;
            long[] jArr5 = new long[length4];
            for (int i5 = 0; i5 < length4; i5++) {
                jArr5[i5] = 0;
            }
            uLongArray = CollectionsKt.plus((Iterable) new ULongArray(jArr5), (Collection) uLongArray3);
        } else {
            uLongArray = new ULongArray(jArr);
        }
        long[] uLongArray4 = UCollectionsKt___UCollectionsKt.toULongArray(uLongArray);
        if (jArr2.length % 3 != 0) {
            ULongArray uLongArray5 = new ULongArray(jArr2);
            int length5 = (((jArr2.length + 2) / 3) * 3) - jArr2.length;
            long[] jArr6 = new long[length5];
            for (int i6 = 0; i6 < length5; i6++) {
                jArr6[i6] = 0;
            }
            uLongArray2 = CollectionsKt.plus((Iterable) new ULongArray(jArr6), (Collection) uLongArray5);
        } else {
            uLongArray2 = new ULongArray(jArr2);
        }
        long[] uLongArray6 = UCollectionsKt___UCollectionsKt.toULongArray(uLongArray2);
        int length6 = uLongArray4.length;
        int length7 = uLongArray6.length;
        if (length6 > length7) {
            int length8 = uLongArray6.length + (length6 - length7);
            long[] jArr7 = new long[length8];
            for (int i7 = 0; i7 < length8; i7++) {
                if (i7 < uLongArray6.length) {
                    j2 = uLongArray6[i7];
                    ULong.Companion companion2 = ULong.Companion;
                } else {
                    j2 = 0;
                }
                jArr7[i7] = j2;
            }
            pair = new Pair(new ULongArray(uLongArray4), new ULongArray(jArr7));
        } else if (length6 < length7) {
            int length9 = uLongArray4.length + (length7 - length6);
            long[] jArr8 = new long[length9];
            for (int i8 = 0; i8 < length9; i8++) {
                if (i8 < uLongArray4.length) {
                    j = uLongArray4[i8];
                    ULong.Companion companion3 = ULong.Companion;
                } else {
                    j = 0;
                }
                jArr8[i8] = j;
            }
            pair = new Pair(new ULongArray(jArr8), new ULongArray(uLongArray6));
        } else {
            pair = new Pair(new ULongArray(uLongArray4), new ULongArray(uLongArray6));
        }
        long[] jArr9 = ((ULongArray) pair.first).storage;
        long[] jArr10 = ((ULongArray) pair.second).storage;
        int max2 = (Math.max(uLongArray4.length, uLongArray6.length) + 2) / 3;
        SignedULongArray signedULongArray4 = new SignedULongArray(UCollectionsKt___UCollectionsKt.toULongArray(UArraysKt___UArraysKt.m4135sliceZRhS8yI(jArr9, RangesKt___RangesKt.until(0, max2))), true);
        int i9 = max2 * 2;
        SignedULongArray signedULongArray5 = new SignedULongArray(UCollectionsKt___UCollectionsKt.toULongArray(UArraysKt___UArraysKt.m4135sliceZRhS8yI(jArr9, RangesKt___RangesKt.until(max2, i9))), true);
        int i10 = max2 * 3;
        SignedULongArray signedULongArray6 = new SignedULongArray(UCollectionsKt___UCollectionsKt.toULongArray(UArraysKt___UArraysKt.m4135sliceZRhS8yI(jArr9, RangesKt___RangesKt.until(i9, i10))), true);
        SignedULongArray signedULongArray7 = new SignedULongArray(UCollectionsKt___UCollectionsKt.toULongArray(UArraysKt___UArraysKt.m4135sliceZRhS8yI(jArr10, RangesKt___RangesKt.until(0, max2))), true);
        SignedULongArray signedULongArray8 = new SignedULongArray(UCollectionsKt___UCollectionsKt.toULongArray(UArraysKt___UArraysKt.m4135sliceZRhS8yI(jArr10, RangesKt___RangesKt.until(max2, i9))), true);
        SignedULongArray signedULongArray9 = new SignedULongArray(UCollectionsKt___UCollectionsKt.toULongArray(UArraysKt___UArraysKt.m4135sliceZRhS8yI(jArr10, RangesKt___RangesKt.until(i9, i10))), true);
        SignedULongArray signedAdd = signedAdd(signedULongArray4, signedULongArray6);
        SignedULongArray signedAdd2 = signedAdd(signedAdd, signedULongArray5);
        SignedULongArray minus$bignum = minus$bignum(signedAdd, signedULongArray5);
        SignedULongArray signedAdd3 = signedAdd(minus$bignum, signedULongArray6);
        SignedULongArray signedULongArray10 = SIGNED_POSITIVE_TWO;
        SignedULongArray minus$bignum2 = minus$bignum(times$bignum(signedAdd3, signedULongArray10), signedULongArray4);
        SignedULongArray signedAdd4 = signedAdd(signedULongArray7, signedULongArray9);
        SignedULongArray signedAdd5 = signedAdd(signedAdd4, signedULongArray8);
        SignedULongArray minus$bignum3 = minus$bignum(signedAdd4, signedULongArray8);
        SignedULongArray minus$bignum4 = minus$bignum(times$bignum(signedAdd(minus$bignum3, signedULongArray9), signedULongArray10), signedULongArray7);
        SignedULongArray times$bignum3 = times$bignum(signedULongArray4, signedULongArray7);
        SignedULongArray times$bignum4 = times$bignum(signedAdd2, signedAdd5);
        SignedULongArray times$bignum5 = times$bignum(minus$bignum, minus$bignum3);
        SignedULongArray times$bignum6 = times$bignum(minus$bignum2, minus$bignum4);
        SignedULongArray times$bignum7 = times$bignum(signedULongArray6, signedULongArray9);
        SignedULongArray minus$bignum5 = minus$bignum(times$bignum6, times$bignum4);
        long[] jArr11 = minus$bignum5.unsignedValue;
        jArr11.getClass();
        long[] jArr12 = ((ULongArray) m2116divideGR1PJdc(jArr11, new long[]{3}).first).storage;
        boolean z = minus$bignum5.sign;
        jArr12.getClass();
        SignedULongArray shr$bignum3 = shr$bignum(minus$bignum(times$bignum4, times$bignum5), 1);
        SignedULongArray minus$bignum6 = minus$bignum(times$bignum5, times$bignum3);
        boolean z2 = !z;
        boolean z3 = minus$bignum6.sign;
        boolean z4 = z3 ^ z2;
        long[] jArr13 = minus$bignum6.unsignedValue;
        if (z4) {
            jArr13.getClass();
            signedULongArray = m2113compareGR1PJdc(jArr13, jArr12) > 0 ? new SignedULongArray(m2124subtractj68ebKY(jArr13, jArr12), z3) : new SignedULongArray(m2124subtractj68ebKY(jArr12, jArr13), z2);
        } else {
            jArr13.getClass();
            signedULongArray = new SignedULongArray(m2109addj68ebKY(jArr13, jArr12), z3);
        }
        SignedULongArray signedAdd6 = signedAdd(shr$bignum(signedULongArray, 1), times$bignum(signedULongArray10, times$bignum7));
        SignedULongArray minus$bignum7 = minus$bignum(signedAdd(minus$bignum6, shr$bignum3), times$bignum7);
        return signedAdd(signedAdd(signedAdd(signedAdd(times$bignum3, shl$bignum(minus$bignum(shr$bignum3, signedAdd6), max2 * 63)), shl$bignum(minus$bignum7, max2 * EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE)), shl$bignum(signedAdd6, max2 * EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE)), shl$bignum(times$bignum7, max2 * EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE)).unsignedValue;
    }

    /* renamed from: numberOfLeadingZerosInAWord-VKZWuLQ, reason: not valid java name */
    public static int m2119numberOfLeadingZerosInAWordVKZWuLQ(long j) {
        int i;
        long j2 = j >>> 32;
        ULong.Companion companion = ULong.Companion;
        if (j2 != 0) {
            i = 31;
            j = j2;
        } else {
            i = 63;
        }
        long j3 = j >>> 16;
        if (j3 != 0) {
            i -= 16;
            j = j3;
        }
        long j4 = j >>> 8;
        if (j4 != 0) {
            i -= 8;
            j = j4;
        }
        long j5 = j >>> 4;
        if (j5 != 0) {
            i -= 4;
            j = j5;
        }
        long j6 = j >>> 2;
        if (j6 != 0) {
            i -= 2;
            j = j6;
        }
        return (j >>> 1) != 0 ? i - 2 : i - ((int) j);
    }

    /* renamed from: parseForBase-_llDaS8, reason: not valid java name */
    public static long[] m2120parseForBase_llDaS8(String str) {
        char c;
        int i;
        str.getClass();
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        long[] jArr = ZERO;
        for (int i2 = 0; i2 < lowerCase.length(); i2++) {
            char charAt = lowerCase.charAt(i2);
            ULong.Companion companion = ULong.Companion;
            long[] m2111baseMultiplyWithCorrectedSize_EW1lsA = m2111baseMultiplyWithCorrectedSize_EW1lsA(10L, jArr, jArr.length - m2115countLeadingZeroWordsQwZRm1k(jArr));
            if ('0' <= charAt && charAt < ':') {
                i = (char) (charAt - '0');
            } else if ('a' <= charAt && charAt < '{') {
                i = charAt - 'W';
            } else if ('A' > charAt || charAt >= '[') {
                if (65313 <= charAt && charAt < 65339) {
                    c = 65323;
                } else {
                    if (65345 > charAt || charAt >= 65371) {
                        if (charAt != '.') {
                            throw new NumberFormatException("Invalid digit for radix " + charAt);
                        }
                        throw new NumberFormatException("Invalid digit for radix " + charAt + " (Possibly a decimal value, which is not supported by BigInteger parser");
                    }
                    c = 65355;
                }
                i = charAt - c;
            } else {
                i = charAt - '7';
            }
            if (i < 0 || i >= 10) {
                throw new NumberFormatException(charAt + " is not a valid digit for number system with base 10");
            }
            jArr = m2109addj68ebKY(m2111baseMultiplyWithCorrectedSize_EW1lsA, new long[]{i});
        }
        return m2121removeLeadingZerosJIhQxVY(jArr);
    }

    /* renamed from: removeLeadingZeros-JIhQxVY, reason: not valid java name */
    public static long[] m2121removeLeadingZerosJIhQxVY(long[] jArr) {
        jArr.getClass();
        int length = jArr.length - m2115countLeadingZeroWordsQwZRm1k(jArr);
        if (length == 0) {
            return ZERO;
        }
        if (jArr.length == length) {
            return jArr;
        }
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(length, jArr.length);
        long[] copyOfRange = Arrays.copyOfRange(jArr, 0, length);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static SignedULongArray shl$bignum(SignedULongArray signedULongArray, int i) {
        return new SignedULongArray(m2122shlGERUpyg$bignum(signedULongArray.unsignedValue, i), signedULongArray.sign);
    }

    /* renamed from: shl-GERUpyg$bignum, reason: not valid java name */
    public static long[] m2122shlGERUpyg$bignum(long[] jArr, int i) {
        int m2115countLeadingZeroWordsQwZRm1k;
        long j;
        long j2;
        jArr.getClass();
        if (m2117isZeroQwZRm1k(jArr) || i == 0) {
            return jArr;
        }
        int length = jArr.length;
        long[] jArr2 = ZERO;
        if (length == 0 || jArr.length == (m2115countLeadingZeroWordsQwZRm1k = m2115countLeadingZeroWordsQwZRm1k(jArr))) {
            return jArr2;
        }
        int length2 = jArr.length - m2115countLeadingZeroWordsQwZRm1k;
        long j3 = jArr[length2 - 1];
        ULong.Companion companion = ULong.Companion;
        int m2119numberOfLeadingZerosInAWordVKZWuLQ = m2119numberOfLeadingZerosInAWordVKZWuLQ(j3);
        int i2 = i / 63;
        int i3 = i % 63;
        int i4 = i3 > m2119numberOfLeadingZerosInAWordVKZWuLQ ? i2 + 1 : i2;
        int i5 = 0;
        if (i3 == 0) {
            int i6 = length2 + i4;
            long[] jArr3 = new long[i6];
            while (i5 < i6) {
                if (i5 < 0 || i5 >= i2) {
                    j2 = jArr[i5 - i2];
                    ULong.Companion companion2 = ULong.Companion;
                } else {
                    j2 = 0;
                }
                jArr3[i5] = j2;
                i5++;
            }
            return jArr3;
        }
        int i7 = length2 + i4;
        long[] jArr4 = new long[i7];
        while (i5 < i7) {
            if (i5 >= 0 && i5 < i2) {
                j = 0;
            } else if (i5 == i2) {
                long j4 = jArr[i5 - i2];
                ULong.Companion companion3 = ULong.Companion;
                j = Long.MAX_VALUE & (j4 << i3);
            } else {
                int i8 = i2 + 1;
                if (i5 < length2 + i2 && i8 <= i5) {
                    int i9 = i5 - i2;
                    long j5 = jArr[i9];
                    ULong.Companion companion4 = ULong.Companion;
                    j = (Long.MAX_VALUE & (j5 << i3)) | (jArr[i9 - 1] >>> (63 - i3));
                } else {
                    if (i5 != i7 - 1) {
                        OptionalProvider$$ExternalSyntheticLambda0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i5, "Invalid case "));
                        return null;
                    }
                    long j6 = jArr[i5 - i4];
                    ULong.Companion companion5 = ULong.Companion;
                    j = j6 >>> (63 - i3);
                }
            }
            jArr4[i5] = j;
            i5++;
        }
        return jArr4;
    }

    public static SignedULongArray shr$bignum(SignedULongArray signedULongArray, int i) {
        return new SignedULongArray(m2123shrGERUpyg$bignum(signedULongArray.unsignedValue, i), signedULongArray.sign);
    }

    /* renamed from: shr-GERUpyg$bignum, reason: not valid java name */
    public static long[] m2123shrGERUpyg$bignum(long[] jArr, int i) {
        long j;
        jArr.getClass();
        if (jArr.length == 0 || i == 0) {
            return jArr;
        }
        int length = jArr.length - m2115countLeadingZeroWordsQwZRm1k(jArr);
        int i2 = i % 63;
        int i3 = i / 63;
        if (i3 < length) {
            if (i2 == 0) {
                ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(length, jArr.length);
                Arrays.copyOfRange(jArr, length - i3, length).getClass();
            }
            if (length > 1 && length - i3 == 1) {
                long j2 = jArr[length - 1];
                ULong.Companion companion = ULong.Companion;
                return new long[]{j2 >>> i2};
            }
            int i4 = length - i3;
            if (i4 != 0) {
                long[] jArr2 = new long[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    if (i5 >= 0 && i5 < (length - 1) - i3) {
                        int i6 = i5 + i3;
                        long j3 = jArr[i6];
                        ULong.Companion companion2 = ULong.Companion;
                        j = (j3 >>> i2) | ((jArr[i6 + 1] << (63 - i2)) & Long.MAX_VALUE);
                    } else {
                        if (i5 != (length - 1) - i3) {
                            OptionalProvider$$ExternalSyntheticLambda0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i5, "Invalid case "));
                            return null;
                        }
                        long j4 = jArr[i5 + i3];
                        ULong.Companion companion3 = ULong.Companion;
                        j = j4 >>> i2;
                    }
                    jArr2[i5] = j;
                }
                return jArr2;
            }
        }
        return ZERO;
    }

    public static SignedULongArray signedAdd(SignedULongArray signedULongArray, SignedULongArray signedULongArray2) {
        boolean z = signedULongArray.sign;
        boolean z2 = signedULongArray2.sign;
        long[] jArr = signedULongArray2.unsignedValue;
        boolean z3 = z ^ z2;
        long[] jArr2 = signedULongArray.unsignedValue;
        if (z3) {
            jArr2.getClass();
            jArr.getClass();
            return m2113compareGR1PJdc(jArr2, jArr) > 0 ? new SignedULongArray(m2124subtractj68ebKY(jArr2, jArr), z) : new SignedULongArray(m2124subtractj68ebKY(jArr, jArr2), z2);
        }
        jArr2.getClass();
        jArr.getClass();
        return new SignedULongArray(m2109addj68ebKY(jArr2, jArr), z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d4, code lost:
    
        if (r0 == 0) goto L33;
     */
    /* renamed from: subtract-j68ebKY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long[] m2124subtractj68ebKY(long[] jArr, long[] jArr2) {
        jArr.getClass();
        jArr2.getClass();
        int length = jArr.length - m2115countLeadingZeroWordsQwZRm1k(jArr);
        int length2 = jArr2.length - m2115countLeadingZeroWordsQwZRm1k(jArr2);
        int m2114compareWithStartIndexesMccmUSY = m2114compareWithStartIndexesMccmUSY(jArr, length, jArr2, length2);
        int i = length2 + 1;
        boolean z = m2114compareWithStartIndexesMccmUSY == 1;
        if (m2114compareWithStartIndexesMccmUSY != 0) {
            if (i == 1) {
                long j = jArr2[0];
                ULong.Companion companion = ULong.Companion;
                if (j == 0) {
                    return jArr;
                }
            }
            if (!z) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1("subtract result less than zero");
                return null;
            }
            Quadruple quadruple = z ? new Quadruple(new ULongArray(jArr), new ULongArray(jArr2), Integer.valueOf(length), Integer.valueOf(length2)) : new Quadruple(new ULongArray(jArr2), new ULongArray(jArr), Integer.valueOf(length2), Integer.valueOf(length));
            long[] jArr3 = ((ULongArray) quadruple.a).storage;
            long[] jArr4 = ((ULongArray) quadruple.b).storage;
            int intValue = ((Number) quadruple.c).intValue();
            int intValue2 = ((Number) quadruple.d).intValue();
            long[] jArr5 = new long[intValue];
            for (int i2 = 0; i2 < intValue; i2++) {
                jArr5[i2] = 0;
            }
            int i3 = 0;
            long j2 = 0;
            while (i3 < intValue2) {
                long j3 = jArr3[i3];
                ULong.Companion companion2 = ULong.Companion;
                long j4 = (j3 - jArr4[i3]) - j2;
                jArr5[i3] = j4 & Long.MAX_VALUE;
                j2 = j4 >>> 63;
                i3++;
            }
            while (j2 != 0) {
                long j5 = jArr3[i3];
                ULong.Companion companion3 = ULong.Companion;
                long j6 = j5 - j2;
                jArr5[i3] = j6 & Long.MAX_VALUE;
                j2 = j6 >>> 63;
                i3++;
            }
            while (i3 < intValue) {
                long j7 = jArr3[i3];
                ULong.Companion companion4 = ULong.Companion;
                jArr5[i3] = j7;
                i3++;
            }
            if (m2115countLeadingZeroWordsQwZRm1k(jArr5) == intValue - 1) {
                long j8 = jArr5[0];
                ULong.Companion companion5 = ULong.Companion;
            }
            return m2121removeLeadingZerosJIhQxVY(jArr5);
        }
        return ZERO;
    }

    public static SignedULongArray times$bignum(SignedULongArray signedULongArray, SignedULongArray signedULongArray2) {
        signedULongArray.getClass();
        signedULongArray2.getClass();
        return new SignedULongArray(m2125timesj68ebKY$bignum(signedULongArray.unsignedValue, signedULongArray2.unsignedValue), !(signedULongArray.sign ^ signedULongArray2.sign));
    }

    /* renamed from: times-j68ebKY$bignum, reason: not valid java name */
    public static long[] m2125timesj68ebKY$bignum(long[] jArr, long[] jArr2) {
        jArr.getClass();
        jArr2.getClass();
        return m2118multiplyj68ebKY(jArr, jArr2);
    }

    /* renamed from: to32Bit-kqpWZOw$bignum, reason: not valid java name */
    public static int[] m2126to32BitkqpWZOw$bignum(long[] jArr) {
        long[] m2121removeLeadingZerosJIhQxVY;
        jArr.getClass();
        if (m2117isZeroQwZRm1k(jArr)) {
            m2121removeLeadingZerosJIhQxVY = ZERO;
        } else {
            int m2112bitLengthQwZRm1k = m2112bitLengthQwZRm1k(jArr);
            int i = m2112bitLengthQwZRm1k % 64 == 0 ? m2112bitLengthQwZRm1k / 64 : (m2112bitLengthQwZRm1k / 64) + 1;
            long[] jArr2 = new long[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 % 63;
                int i4 = (i2 / 63) + i2;
                int i5 = i4 + 1;
                if (i5 < jArr.length) {
                    long j = jArr[i4];
                    ULong.Companion companion = ULong.Companion;
                    jArr2[i2] = (jArr[i5] << (63 - i3)) | (j >>> i3);
                } else {
                    long j2 = jArr[i4];
                    ULong.Companion companion2 = ULong.Companion;
                    jArr2[i2] = j2 >>> i3;
                }
            }
            m2121removeLeadingZerosJIhQxVY = m2121removeLeadingZerosJIhQxVY(jArr2);
        }
        int length = m2121removeLeadingZerosJIhQxVY.length * 2;
        int[] iArr = new int[length];
        int length2 = m2121removeLeadingZerosJIhQxVY.length;
        for (int i6 = 0; i6 < length2; i6++) {
            int i7 = i6 * 2;
            long j3 = m2121removeLeadingZerosJIhQxVY[i6];
            ULong.Companion companion3 = ULong.Companion;
            int i8 = (int) (BodyPartID.bodyIdMax & j3);
            UInt.Companion companion4 = UInt.Companion;
            iArr[i7] = i8;
            iArr[i7 + 1] = (int) (j3 >>> 32);
        }
        int i9 = length - 1;
        if (i9 >= 0) {
            while (true) {
                int i10 = i9 - 1;
                int i11 = iArr[i9];
                UInt.Companion companion5 = UInt.Companion;
                if (i11 != 0) {
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                i9 = i10;
            }
        }
        i9 = -1;
        int i12 = i9 + 1;
        return (i12 == -1 || i12 == 0) ? BigInteger32Arithmetic.ZERO : ArraysKt___ArraysJvmKt.copyOfRange(iArr, 0, i12);
    }
}
