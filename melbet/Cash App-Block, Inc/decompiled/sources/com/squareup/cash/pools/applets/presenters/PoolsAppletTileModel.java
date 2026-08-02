package com.squareup.cash.pools.applets.presenters;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PoolsAppletTileModel {

    public final class Installed implements PoolsAppletTileModel {
        public final ArrayList activePools;
        public final String footerText;
        public final int overflowCount;

        public Installed(int i, String str, ArrayList arrayList) {
            this.activePools = arrayList;
            this.footerText = str;
            this.overflowCount = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Installed)) {
                return false;
            }
            Installed installed = (Installed) obj;
            return this.activePools.equals(installed.activePools) && Intrinsics.areEqual(this.footerText, installed.footerText) && this.overflowCount == installed.overflowCount;
        }

        public final int hashCode() {
            int hashCode = this.activePools.hashCode() * 31;
            String str = this.footerText;
            return Integer.hashCode(this.overflowCount) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Installed(activePools=");
            sb.append(this.activePools);
            sb.append(", footerText=");
            sb.append(this.footerText);
            sb.append(", overflowCount=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.overflowCount, ")", sb);
        }
    }

    public final class Uninstalled implements PoolsAppletTileModel {
        public final String subtitle;
        public final String title;

        public Uninstalled(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.subtitle = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uninstalled)) {
                return false;
            }
            Uninstalled uninstalled = (Uninstalled) obj;
            return Intrinsics.areEqual(this.title, uninstalled.title) && Intrinsics.areEqual(this.subtitle, uninstalled.subtitle);
        }

        public final int hashCode() {
            return this.subtitle.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Uninstalled(title=", this.title, ", subtitle=", this.subtitle, ")");
        }
    }
}
