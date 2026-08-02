package com.squareup.cash.multiplatform.bitcoin.parsers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinAddress;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinVersion;
import com.squareup.cash.multiplatform.bitcoin.parsers.encoding.Base58;
import java.util.Set;
import kotlin.UInt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public abstract class RealBitcoinAddressParserKt {
    public static final Set DEFAULT_ALLOWED_NETWORKS = ArraysKt___ArraysKt.toSet(new BitcoinNetwork[]{BitcoinNetwork.MAINNET, BitcoinNetwork.TESTNET});

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:23|24))(3:25|26|(1:28))|12|(4:14|(1:16)|17|(0)(1:19))|22))|30|6|7|(0)(0)|12|(0)|22) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[Catch: AddressFormatException -> 0x007b, TryCatch #0 {AddressFormatException -> 0x007b, blocks: (B:11:0x002b, B:12:0x004a, B:14:0x0060, B:16:0x0068, B:17:0x006e, B:26:0x0038), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$tryParseBase58Address(String str, Set set, ContinuationImpl continuationImpl) {
        RealBitcoinAddressParserKt$tryParseBase58Address$1 realBitcoinAddressParserKt$tryParseBase58Address$1;
        int i;
        BitcoinAddress.LegacyAddress legacyAddress;
        if (continuationImpl instanceof RealBitcoinAddressParserKt$tryParseBase58Address$1) {
            realBitcoinAddressParserKt$tryParseBase58Address$1 = (RealBitcoinAddressParserKt$tryParseBase58Address$1) continuationImpl;
            int i2 = realBitcoinAddressParserKt$tryParseBase58Address$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBitcoinAddressParserKt$tryParseBase58Address$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBitcoinAddressParserKt$tryParseBase58Address$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBitcoinAddressParserKt$tryParseBase58Address$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Base58 base58 = Base58.INSTANCE;
                    realBitcoinAddressParserKt$tryParseBase58Address$1.L$0 = str;
                    realBitcoinAddressParserKt$tryParseBase58Address$1.L$1 = set;
                    realBitcoinAddressParserKt$tryParseBase58Address$1.label = 1;
                    obj = base58.decodeChecked(str, realBitcoinAddressParserKt$tryParseBase58Address$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set = realBitcoinAddressParserKt$tryParseBase58Address$1.L$1;
                    str = realBitcoinAddressParserKt$tryParseBase58Address$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                byte b = ((byte[]) obj)[0];
                UInt.Companion companion = UInt.Companion;
                legacyAddress = new BitcoinAddress.LegacyAddress(str, BitcoinVersion.Companion.m3661fromRawValueWZ4Q5Ns(b));
                if (legacyAddress.getNetwork() != null) {
                    if (set.contains(BitcoinNetwork.REGTEST)) {
                        set = SetsKt___SetsKt.plus(set, BitcoinNetwork.TESTNET);
                    }
                    if (!CollectionsKt.contains(set, legacyAddress.getNetwork())) {
                        return null;
                    }
                }
                return legacyAddress;
            }
        }
        realBitcoinAddressParserKt$tryParseBase58Address$1 = new RealBitcoinAddressParserKt$tryParseBase58Address$1(continuationImpl);
        Object obj3 = realBitcoinAddressParserKt$tryParseBase58Address$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBitcoinAddressParserKt$tryParseBase58Address$1.label;
        if (i != 0) {
        }
        byte b2 = ((byte[]) obj3)[0];
        UInt.Companion companion2 = UInt.Companion;
        legacyAddress = new BitcoinAddress.LegacyAddress(str, BitcoinVersion.Companion.m3661fromRawValueWZ4Q5Ns(b2));
        if (legacyAddress.getNetwork() != null) {
        }
        return legacyAddress;
    }
}
