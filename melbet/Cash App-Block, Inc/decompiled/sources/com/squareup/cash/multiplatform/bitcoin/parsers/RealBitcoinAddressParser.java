package com.squareup.cash.multiplatform.bitcoin.parsers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.n;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinAddress;
import com.squareup.cash.multiplatform.bitcoin.parsers.encoding.Bech32;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealBitcoinAddressParser {
    public final Set allowedNetworks;

    public RealBitcoinAddressParser() {
        Set set = RealBitcoinAddressParserKt.DEFAULT_ALLOWED_NETWORKS;
        set.getClass();
        this.allowedNetworks = CollectionsKt.toSet(set);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:21|(4:23|(2:24|(2:26|(2:28|29)(1:40))(2:41|42))|30|(2:32|(2:34|35))(2:36|(2:38|39)))|43)|19|20))|46|6|7|(0)(0)|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        r0.L$0 = null;
        r0.label = 2;
        r10 = com.squareup.cash.multiplatform.bitcoin.parsers.RealBitcoinAddressParserKt.access$tryParseBase58Address(r9, r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        if (r10 != r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object parse(String str, ContinuationImpl continuationImpl) {
        RealBitcoinAddressParser$parse$1 realBitcoinAddressParser$parse$1;
        int i;
        n.a decode;
        Object obj;
        if (continuationImpl instanceof RealBitcoinAddressParser$parse$1) {
            realBitcoinAddressParser$parse$1 = (RealBitcoinAddressParser$parse$1) continuationImpl;
            int i2 = realBitcoinAddressParser$parse$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBitcoinAddressParser$parse$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realBitcoinAddressParser$parse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBitcoinAddressParser$parse$1.label;
                Set set = this.allowedNetworks;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (!StringsKt.isBlank(str)) {
                        decode = Bech32.decode(str, true);
                        String hrp = decode.getHrp();
                        Set set2 = RealBitcoinAddressParserKt.DEFAULT_ALLOWED_NETWORKS;
                        Iterator it = BitcoinNetwork.$ENTRIES.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (hrp.equals(((BitcoinNetwork) obj).prefix)) {
                                break;
                            }
                        }
                        BitcoinNetwork bitcoinNetwork = (BitcoinNetwork) obj;
                        if (bitcoinNetwork == null) {
                            realBitcoinAddressParser$parse$1.L$0 = str;
                            realBitcoinAddressParser$parse$1.label = 1;
                            obj2 = RealBitcoinAddressParserKt.access$tryParseBase58Address(str, set, realBitcoinAddressParser$parse$1);
                            if (obj2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else if (set.contains(bitcoinNetwork)) {
                            return new BitcoinAddress.NativeSegwitAddress(str, bitcoinNetwork);
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj2);
                        return (BitcoinAddress) obj2;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str2 = realBitcoinAddressParser$parse$1.L$0;
                SafeTrace.throwOnFailure(obj2);
                return (BitcoinAddress) obj2;
            }
        }
        realBitcoinAddressParser$parse$1 = new RealBitcoinAddressParser$parse$1(this, continuationImpl);
        Object obj22 = realBitcoinAddressParser$parse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBitcoinAddressParser$parse$1.label;
        Set set3 = this.allowedNetworks;
        if (i != 0) {
        }
        return (BitcoinAddress) obj22;
    }
}
