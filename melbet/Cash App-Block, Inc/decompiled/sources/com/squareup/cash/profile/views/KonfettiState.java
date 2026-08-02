package com.squareup.cash.profile.views;

import nl.dionsegijn.konfetti.core.Party;

/* loaded from: classes7.dex */
public interface KonfettiState {

    public final class Idle implements KonfettiState {
        public static final Idle INSTANCE = new Idle();
    }

    public final class Started implements KonfettiState {
        public final Party party;

        public Started(Party party) {
            party.getClass();
            this.party = party;
        }
    }
}
