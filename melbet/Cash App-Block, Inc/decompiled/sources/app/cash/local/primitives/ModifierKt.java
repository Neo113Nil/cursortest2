package app.cash.local.primitives;

import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.LocalMenuAvailability;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemModifierList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class ModifierKt {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewDetailsPage.deepLinkSpecs;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006b A[SYNTHETIC] */
    /* renamed from: toModifierOrNull-oZYGaNE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Modifier m1276toModifierOrNulloZYGaNE(LocalMenuItemModifierList.Modifier modifier, String str) {
        NestedModifierList nestedModifierList;
        modifier.getClass();
        String str2 = modifier.token;
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                ScopedModifierTokensKt.requireNoModifierScopeSeparator(str2);
                if (str != null) {
                    ScopedModifierTokensKt.requireNoModifierScopeSeparator(str2);
                    str2 = str + "\u001f" + str2;
                }
                String str3 = str2;
                String str4 = modifier.name;
                if (str4 != null) {
                    String str5 = str4.length() > 0 ? str4 : null;
                    if (str5 != null) {
                        com.squareup.protos.cash.local.client.v1.LocalMoney localMoney = modifier.price;
                        LocalMoney money = localMoney != null ? LocalMoneyKt.toMoney(localMoney) : null;
                        boolean areEqual = Intrinsics.areEqual(modifier.selected_by_default, Boolean.TRUE);
                        LocalMenuAvailability localMenuAvailability = modifier.availability;
                        if (localMenuAvailability == null) {
                            localMenuAvailability = LocalMenuAvailability.LOCAL_MENU_AVAILABILITY_NORMAL;
                        }
                        LocalMenuAvailability localMenuAvailability2 = localMenuAvailability;
                        List<LocalMenuItemModifierList.NestedModifierList> list = modifier.nested_modifier_lists;
                        ArrayList arrayList = new ArrayList();
                        for (LocalMenuItemModifierList.NestedModifierList nestedModifierList2 : list) {
                            nestedModifierList2.getClass();
                            String str6 = nestedModifierList2.token;
                            List list2 = nestedModifierList2.modifiers;
                            if (str6 != null) {
                                if (str6.length() <= 0) {
                                    str6 = null;
                                }
                                if (str6 != null) {
                                    ScopedModifierTokensKt.requireNoModifierScopeSeparator(str6);
                                    ScopedModifierTokensKt.requireNoModifierScopeSeparator(str6);
                                    String str7 = str3 + "\u001f" + str6;
                                    String str8 = nestedModifierList2.name;
                                    if (str8 != null) {
                                        String str9 = str8.length() > 0 ? str8 : null;
                                        if (str9 != null) {
                                            Integer num = nestedModifierList2.min_selections;
                                            int intValue = num != null ? num.intValue() : 0;
                                            Integer num2 = nestedModifierList2.max_selections;
                                            Integer valueOf = num2 != null ? Integer.valueOf(Math.max(num2.intValue(), intValue)) : null;
                                            boolean isEmpty = list2.isEmpty();
                                            boolean areEqual2 = Intrinsics.areEqual(nestedModifierList2.allow_quantities, Boolean.TRUE);
                                            ArrayList arrayList2 = new ArrayList();
                                            Iterator it = list2.iterator();
                                            while (it.hasNext()) {
                                                Modifier m1276toModifierOrNulloZYGaNE = m1276toModifierOrNulloZYGaNE((LocalMenuItemModifierList.Modifier) it.next(), str7);
                                                if (m1276toModifierOrNulloZYGaNE != null) {
                                                    arrayList2.add(m1276toModifierOrNulloZYGaNE);
                                                }
                                            }
                                            nestedModifierList = new NestedModifierList(str7, str9, intValue, valueOf, areEqual2, arrayList2, isEmpty, nestedModifierList2.max_length, Intrinsics.areEqual(nestedModifierList2.require_non_empty_string, Boolean.TRUE));
                                            if (nestedModifierList == null) {
                                                arrayList.add(nestedModifierList);
                                            }
                                        }
                                    }
                                }
                            }
                            nestedModifierList = null;
                            if (nestedModifierList == null) {
                            }
                        }
                        return new Modifier(str3, str5, money, areEqual, localMenuAvailability2, arrayList);
                    }
                }
            }
        }
        return null;
    }
}
