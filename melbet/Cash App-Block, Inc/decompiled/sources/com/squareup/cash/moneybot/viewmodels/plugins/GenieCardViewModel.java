package com.squareup.cash.moneybot.viewmodels.plugins;

import kotlin.jvm.internal.Intrinsics;
import xyz.block.protos.genie.KeyValueMap;
import xyz.block.protos.genie.ViewPlan;

/* loaded from: classes6.dex */
public final class GenieCardViewModel {
    public final Content content;
    public final String fallbackText;
    public final KeyValueMap sceneInputs;

    public interface Content {

        public final class Error implements Content {
            public static final Error INSTANCE = new Error();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Error);
            }

            public final int hashCode() {
                return 2011393125;
            }

            public final String toString() {
                return "Error";
            }
        }

        public final class Fallback implements Content {
            public static final Fallback INSTANCE = new Fallback();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Fallback);
            }

            public final int hashCode() {
                return 1689064293;
            }

            public final String toString() {
                return "Fallback";
            }
        }

        public final class Loading implements Content {
            public static final Loading INSTANCE = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return 2029148249;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public final class Rendered implements Content {
            public final ViewPlan plan;

            public Rendered(ViewPlan viewPlan) {
                this.plan = viewPlan;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Rendered) && this.plan.equals(((Rendered) obj).plan);
            }

            public final int hashCode() {
                return this.plan.hashCode();
            }

            public final String toString() {
                return "Rendered(plan=" + this.plan + ")";
            }
        }
    }

    public GenieCardViewModel(String str, Content content, KeyValueMap keyValueMap) {
        content.getClass();
        this.fallbackText = str;
        this.content = content;
        this.sceneInputs = keyValueMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenieCardViewModel)) {
            return false;
        }
        GenieCardViewModel genieCardViewModel = (GenieCardViewModel) obj;
        return this.fallbackText.equals(genieCardViewModel.fallbackText) && Intrinsics.areEqual(this.content, genieCardViewModel.content) && Intrinsics.areEqual(this.sceneInputs, genieCardViewModel.sceneInputs);
    }

    public final int hashCode() {
        int hashCode = (this.content.hashCode() + (this.fallbackText.hashCode() * 31)) * 31;
        KeyValueMap keyValueMap = this.sceneInputs;
        return hashCode + (keyValueMap == null ? 0 : keyValueMap.hashCode());
    }

    public final String toString() {
        return "GenieCardViewModel(fallbackText=" + this.fallbackText + ", content=" + this.content + ", sceneInputs=" + this.sceneInputs + ")";
    }
}
