package defpackage;

/* loaded from: classes5.dex */
public interface wl00 {
    default void onMapCollapsed() {
    }

    void onMapDragged();

    default void onMapExpanded() {
    }

    void onMapPressed();

    void onMapReleased();

    default boolean onMapTapped(float f, float f2) {
        return false;
    }
}
