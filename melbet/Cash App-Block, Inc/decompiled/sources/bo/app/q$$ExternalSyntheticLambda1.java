package bo.app;

import android.nfc.NfcAdapter;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.models.Banner;
import com.fidesmo.sec.delivery.ServiceDeliveryClient;
import com.google.android.gms.maps.zzai;
import com.squareup.cash.fidesmo.real.RealFidesmoClient;
import com.squareup.cash.nfc.backend.real.RealNfcPaymentsManager;
import com.squareup.kotterknife.Lazy;
import com.squareup.scannerview.TextSetter;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.HexExtensionsKt;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class q$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ q$$ExternalSyntheticLambda1(long j, RealFidesmoClient realFidesmoClient, ServiceDeliveryClient serviceDeliveryClient) {
        this.$r8$classId = 6;
        this.f$1 = j;
        this.f$0 = realFidesmoClient;
        this.f$2 = serviceDeliveryClient;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit logPushDelivery$lambda$1;
        boolean z = false;
        switch (this.$r8$classId) {
            case 0:
                return q.a((Banner) this.f$0, this.f$1, (Long) this.f$2);
            case 1:
                return f4.a((id) this.f$0, this.f$1, (id) this.f$2);
            case 2:
                return fd.a((id) this.f$0, this.f$1, (t9) this.f$2);
            case 3:
                return fd.a((hd) this.f$0, (id) this.f$2, this.f$1);
            case 4:
                return id.a((id) this.f$0, (jd) this.f$2, this.f$1);
            case 5:
                logPushDelivery$lambda$1 = Braze.logPushDelivery$lambda$1((Braze) this.f$0, (String) this.f$2, this.f$1);
                return logPushDelivery$lambda$1;
            case 6:
                long j = this.f$1;
                RealFidesmoClient realFidesmoClient = (RealFidesmoClient) this.f$0;
                ServiceDeliveryClient serviceDeliveryClient = (ServiceDeliveryClient) this.f$2;
                if (j == realFidesmoClient.activeDeliveryReconnectAttempt.get() && RealFidesmoClient.access$isActiveDelivery(realFidesmoClient, serviceDeliveryClient)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                zzai zzaiVar = (zzai) this.f$0;
                NfcAdapter.ReaderCallback readerCallback = (NfcAdapter.ReaderCallback) this.f$2;
                long j2 = this.f$1;
                ((RealNfcPaymentsManager) zzaiVar.zaa).enableReaderMode(387, new Bundle(), readerCallback);
                Timber.Forest forest = Timber.Forest;
                byte[] bArr = (byte[]) zzaiVar.zac;
                forest.i("Starting ECR with ReaderId: ".concat(HexExtensionsKt.toHexString$default(bArr)), new Object[0]);
                TextSetter textSetter = (TextSetter) zzaiVar.zza;
                textSetter.getClass();
                Lazy lazy = (Lazy) ((AssetPublicSuffixList) textSetter.textSwitcher).path;
                synchronized (lazy.value) {
                    CollectionsKt.toList((ArrayDeque) lazy.initializer);
                    ((ArrayDeque) lazy.initializer).clear();
                }
                textSetter.getEmbeddedCardReader().startReader(bArr, ((String) textSetter.textView).equals("Production"));
                textSetter.getEmbeddedCardReader().startPayment(j2, false);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ q$$ExternalSyntheticLambda1(Object obj, long j, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = obj2;
    }

    public /* synthetic */ q$$ExternalSyntheticLambda1(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = j;
    }
}
