package com.squareup.cash.card.onboarding;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TileCarouselSection implements ProductDetailsPageSection {
    public final List tiles;

    public final class Tile {
        public final String description;
        public final Image image;
        public final String title;

        public Tile(Image image, String str, String str2) {
            this.image = image;
            this.title = str;
            this.description = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tile)) {
                return false;
            }
            Tile tile = (Tile) obj;
            return this.image.equals(tile.image) && this.title.equals(tile.title) && this.description.equals(tile.description);
        }

        public final int hashCode() {
            return this.description.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.image.hashCode() * 31, 31, this.title);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Matcher$$ExternalSyntheticOutline0.m(this.image, "Tile(image=", ", title=", this.title, ", description="), this.description, ")");
        }
    }

    public TileCarouselSection(List list) {
        list.getClass();
        this.tiles = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TileCarouselSection) && Intrinsics.areEqual(this.tiles, ((TileCarouselSection) obj).tiles);
    }

    public final int hashCode() {
        return this.tiles.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("TileCarouselSection(tiles=", ")", this.tiles);
    }
}
