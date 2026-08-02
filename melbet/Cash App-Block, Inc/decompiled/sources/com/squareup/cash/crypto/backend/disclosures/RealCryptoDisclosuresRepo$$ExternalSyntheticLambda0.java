package com.squareup.cash.crypto.backend.disclosures;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import com.squareup.cash.R;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class RealCryptoDisclosuresRepo$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealCryptoDisclosuresRepo f$0;

    public /* synthetic */ RealCryptoDisclosuresRepo$$ExternalSyntheticLambda0(RealCryptoDisclosuresRepo realCryptoDisclosuresRepo, int i) {
        this.$r8$classId = i;
        this.f$0 = realCryptoDisclosuresRepo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        RealCryptoDisclosuresRepo realCryptoDisclosuresRepo = this.f$0;
        String str = (String) obj;
        switch (i) {
            case 0:
                if (str == null) {
                    return null;
                }
                Resources resources = realCryptoDisclosuresRepo.stringManager.resources;
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.bitcoin_home_disclosure)).format(new Object[]{str});
                format2.getClass();
                return new CryptoDisclosure(format2, str);
            default:
                if (str == null) {
                    return null;
                }
                Resources resources2 = realCryptoDisclosuresRepo.stringManager.resources;
                resources2.getClass();
                String format3 = new MessageFormat(resources2.getString(R.string.stablecoin_home_disclosure)).format(new Object[]{str});
                format3.getClass();
                return new CryptoDisclosure(format3, str);
        }
    }
}
