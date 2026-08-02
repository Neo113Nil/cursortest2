package app.cash.redwood.widget;

import app.cash.redwood.Modifier;

/* loaded from: classes3.dex */
public interface Widget {

    public interface Children {
        void detach();

        void insert(int i, Widget widget);

        void move(int i, int i2, int i3);

        void onModifierUpdated(int i, Widget widget);

        void remove(int i, int i2);
    }

    Modifier getModifier();

    Object getValue();

    void setModifier(Modifier modifier);
}
