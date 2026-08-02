package com.squareup.cash.blockers.viewmodels;

import com.squareup.cash.securitysignals.models.SignalsContext;
import com.squareup.protos.common.location.GlobalAddress;

/* loaded from: classes4.dex */
public abstract class IdvViewEvent {

    public final class SubmitAddress extends IdvViewEvent {
        public final GlobalAddress address;
        public final SignalsContext signalsContext;

        public SubmitAddress(GlobalAddress globalAddress, SignalsContext signalsContext) {
            globalAddress.getClass();
            this.address = globalAddress;
            this.signalsContext = signalsContext;
        }
    }

    public final class SubmitSsn extends IdvViewEvent {
        public final boolean lastFour;
        public final SignalsContext signalsContext;
        public final String ssn;

        public SubmitSsn(String str, boolean z, SignalsContext signalsContext) {
            this.ssn = str;
            this.lastFour = z;
            this.signalsContext = signalsContext;
        }
    }
}
