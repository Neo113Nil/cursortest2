package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.action_button;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/logistics/sdk/cargo_form/impl/ui/widgets/action_button/ActionButtonMapper$Container", "", "Lru/yandex/logistics/sdk/cargo_form/impl/ui/widgets/action_button/ActionButtonMapper$Container;", "FORM", "HORIZONTAL_STACK", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActionButtonMapper$Container {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ActionButtonMapper$Container[] $VALUES;
    public static final ActionButtonMapper$Container FORM;
    public static final ActionButtonMapper$Container HORIZONTAL_STACK;

    static {
        ActionButtonMapper$Container actionButtonMapper$Container = new ActionButtonMapper$Container("FORM", 0);
        FORM = actionButtonMapper$Container;
        ActionButtonMapper$Container actionButtonMapper$Container2 = new ActionButtonMapper$Container("HORIZONTAL_STACK", 1);
        HORIZONTAL_STACK = actionButtonMapper$Container2;
        ActionButtonMapper$Container[] actionButtonMapper$ContainerArr = {actionButtonMapper$Container, actionButtonMapper$Container2};
        $VALUES = actionButtonMapper$ContainerArr;
        $ENTRIES = kotlin.enums.a.a(actionButtonMapper$ContainerArr);
    }

    public static ActionButtonMapper$Container valueOf(String str) {
        return (ActionButtonMapper$Container) Enum.valueOf(ActionButtonMapper$Container.class, str);
    }

    public static ActionButtonMapper$Container[] values() {
        return (ActionButtonMapper$Container[]) $VALUES.clone();
    }
}
