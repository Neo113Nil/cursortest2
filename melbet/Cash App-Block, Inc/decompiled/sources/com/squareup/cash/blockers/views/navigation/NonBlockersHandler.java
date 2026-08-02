package com.squareup.cash.blockers.views.navigation;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.backstack.real.RealBackStackEditor;
import com.squareup.cash.blockers.screens.BlockersScreens;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class NonBlockersHandler implements BackStackHandler {
    public final List exemptScreens;
    public final List flowsToPopByName;

    public NonBlockersHandler(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.exemptScreens = list;
        this.flowsToPopByName = list2;
    }

    @Override // com.squareup.cash.blockers.views.navigation.BackStackHandler
    public final boolean handleAndContinue(RealBackStackEditor realBackStackEditor, Screen screen) {
        screen.getClass();
        if (screen instanceof BlockersScreens) {
            return true;
        }
        List list = this.exemptScreens;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) ((Function1) it.next()).invoke(screen)).booleanValue()) {
                    return true;
                }
            }
        }
        String[] strArr = (String[]) this.flowsToPopByName.toArray(new String[0]);
        realBackStackEditor.popCurrentFlowsWithNames((String[]) Arrays.copyOf(strArr, strArr.length));
        return false;
    }
}
