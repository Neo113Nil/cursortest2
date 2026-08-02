package com.squareup.cash.shopping.viewmodels;

/* loaded from: classes7.dex */
public abstract class PillStage {

    public final class Confirmed extends PillStage {
        public static final Confirmed INSTANCE = new Confirmed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirmed);
        }

        public final int hashCode() {
            return -1553161941;
        }

        public final String toString() {
            return "Confirmed";
        }
    }

    public final class Error extends PillStage {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -1121061420;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Initial extends PillStage {
        public static final Initial INSTANCE = new Initial();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Initial);
        }

        public final int hashCode() {
            return -170870768;
        }

        public final String toString() {
            return "Initial";
        }
    }

    public abstract class SUPPillStage extends PillStage {

        public final class PlanDetails extends SUPPillStage {
            public static final PlanDetails INSTANCE = new PlanDetails();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PlanDetails);
            }

            public final int hashCode() {
                return -81191274;
            }

            public final String toString() {
                return "PlanDetails";
            }
        }

        public final class SetUpPlan extends SUPPillStage {
            public static final SetUpPlan INSTANCE = new SetUpPlan();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SetUpPlan);
            }

            public final int hashCode() {
                return -948127133;
            }

            public final String toString() {
                return "SetUpPlan";
            }
        }
    }
}
