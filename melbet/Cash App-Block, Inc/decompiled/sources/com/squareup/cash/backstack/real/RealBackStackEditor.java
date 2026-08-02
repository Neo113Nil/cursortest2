package com.squareup.cash.backstack.real;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.backstack.api.BackStack$Entry;
import com.squareup.cash.backstack.api.BackStack$ScreenEntry;
import com.squareup.cash.backstack.real.RealBackStack;
import com.squareup.cash.blockers.views.navigation.FlowData;
import com.squareup.cash.observability.types.ErrorReporter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ConnectionPool;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class RealBackStackEditor {
    public boolean committed;
    public final ArrayDeque entries;
    public final ErrorReporter errorReporter;
    public final ArrayList ledger;
    public final RealBackStack parent;
    public final RealBackStack view;

    /* loaded from: classes5.dex */
    public final class ClearCurrentFlow {
        public final List itemsCleared;

        public ClearCurrentFlow(List list) {
            list.getClass();
            this.itemsCleared = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClearCurrentFlow) && Intrinsics.areEqual(this.itemsCleared, ((ClearCurrentFlow) obj).itemsCleared);
        }

        public final int hashCode() {
            return this.itemsCleared.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("ClearCurrentFlow(itemsCleared=", ")", this.itemsCleared);
        }
    }

    public final class Cleared {
        public static final Cleared INSTANCE = new Cleared();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cleared);
        }

        public final int hashCode() {
            return 1409100445;
        }

        public final String toString() {
            return "Cleared";
        }
    }

    /* loaded from: classes5.dex */
    public final class ClearedFlow {
        public final List entries;
        public final String name;

        public ClearedFlow(String str, List list) {
            list.getClass();
            this.name = str;
            this.entries = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClearedFlow)) {
                return false;
            }
            ClearedFlow clearedFlow = (ClearedFlow) obj;
            return Intrinsics.areEqual(this.name, clearedFlow.name) && Intrinsics.areEqual(this.entries, clearedFlow.entries);
        }

        public final int hashCode() {
            String str = this.name;
            return this.entries.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("ClearedFlow(name=", this.name, ", entries=", ")", this.entries);
        }
    }

    /* loaded from: classes5.dex */
    public final class PopCurrentFlowsIfEmpty {
        public final List cleared;

        public PopCurrentFlowsIfEmpty(List list) {
            list.getClass();
            this.cleared = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PopCurrentFlowsIfEmpty) && Intrinsics.areEqual(this.cleared, ((PopCurrentFlowsIfEmpty) obj).cleared);
        }

        public final int hashCode() {
            return this.cleared.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("PopCurrentFlowsIfEmpty(cleared=", ")", this.cleared);
        }
    }

    /* loaded from: classes5.dex */
    public final class PopCurrentFlowsWithNames {
        public final List cleared;

        public PopCurrentFlowsWithNames(List list) {
            list.getClass();
            this.cleared = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PopCurrentFlowsWithNames) && Intrinsics.areEqual(this.cleared, ((PopCurrentFlowsWithNames) obj).cleared);
        }

        public final int hashCode() {
            return this.cleared.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("PopCurrentFlowsWithNames(cleared=", ")", this.cleared);
        }
    }

    /* loaded from: classes5.dex */
    public final class PopFlow {
        public final ClearedFlow flow;

        public PopFlow(ClearedFlow clearedFlow) {
            this.flow = clearedFlow;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PopFlow) && this.flow.equals(((PopFlow) obj).flow);
        }

        public final int hashCode() {
            return this.flow.hashCode();
        }

        public final String toString() {
            return "PopFlow(flow=" + this.flow + ")";
        }
    }

    /* loaded from: classes5.dex */
    public final class PopScreen {
        public final ArrayList marks;
        public final BackStack$ScreenEntry screen;

        public PopScreen(BackStack$ScreenEntry backStack$ScreenEntry, ArrayList arrayList) {
            backStack$ScreenEntry.getClass();
            this.screen = backStack$ScreenEntry;
            this.marks = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PopScreen)) {
                return false;
            }
            PopScreen popScreen = (PopScreen) obj;
            return Intrinsics.areEqual(this.screen, popScreen.screen) && this.marks.equals(popScreen.marks);
        }

        public final int hashCode() {
            return this.marks.hashCode() + (this.screen.hashCode() * 31);
        }

        public final String toString() {
            return "PopScreen(screen=" + this.screen + ", marks=" + this.marks + ")";
        }
    }

    /* loaded from: classes5.dex */
    public final class PopToMarkAndReturnOwner {
        public final List entries;
        public final String id;

        public PopToMarkAndReturnOwner(String str, List list) {
            str.getClass();
            list.getClass();
            this.id = str;
            this.entries = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PopToMarkAndReturnOwner)) {
                return false;
            }
            PopToMarkAndReturnOwner popToMarkAndReturnOwner = (PopToMarkAndReturnOwner) obj;
            return Intrinsics.areEqual(this.id, popToMarkAndReturnOwner.id) && Intrinsics.areEqual(this.entries, popToMarkAndReturnOwner.entries);
        }

        public final int hashCode() {
            return this.entries.hashCode() + (this.id.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("PopToMarkAndReturnOwner(id=", this.id, ", entries=", ")", this.entries);
        }
    }

    /* loaded from: classes5.dex */
    public final class PopToMarkIfOwnerMatches {
        public final List entries;
        public final String id;
        public final String owner;

        public PopToMarkIfOwnerMatches(String str, String str2, List list) {
            Request$Priority$EnumUnboxingLocalUtility.m(str, str2, list);
            this.id = str;
            this.owner = str2;
            this.entries = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PopToMarkIfOwnerMatches)) {
                return false;
            }
            PopToMarkIfOwnerMatches popToMarkIfOwnerMatches = (PopToMarkIfOwnerMatches) obj;
            return Intrinsics.areEqual(this.id, popToMarkIfOwnerMatches.id) && Intrinsics.areEqual(this.owner, popToMarkIfOwnerMatches.owner) && Intrinsics.areEqual(this.entries, popToMarkIfOwnerMatches.entries);
        }

        public final int hashCode() {
            return this.entries.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.owner);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PopToMarkIfOwnerMatches(id=", this.id, ", owner=", this.owner, ", entries="), this.entries, ")");
        }
    }

    /* loaded from: classes5.dex */
    public final class PushEntry {
        public final BackStack$Entry entry;

        public PushEntry(BackStack$Entry backStack$Entry) {
            backStack$Entry.getClass();
            this.entry = backStack$Entry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PushEntry) && Intrinsics.areEqual(this.entry, ((PushEntry) obj).entry);
        }

        public final int hashCode() {
            return this.entry.hashCode();
        }

        public final String toString() {
            return "PushEntry(entry=" + this.entry + ")";
        }
    }

    /* loaded from: classes5.dex */
    public final class ResetBeforeMark {
        public final List entries;
        public final String id;

        public ResetBeforeMark(String str, List list) {
            str.getClass();
            list.getClass();
            this.id = str;
            this.entries = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResetBeforeMark)) {
                return false;
            }
            ResetBeforeMark resetBeforeMark = (ResetBeforeMark) obj;
            return Intrinsics.areEqual(this.id, resetBeforeMark.id) && Intrinsics.areEqual(this.entries, resetBeforeMark.entries);
        }

        public final int hashCode() {
            return this.entries.hashCode() + (this.id.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("ResetBeforeMark(id=", this.id, ", entries=", ")", this.entries);
        }
    }

    /* loaded from: classes5.dex */
    public final class StartFlow {
        public final RealBackStack.FlowEntry flowEntry;

        public StartFlow(RealBackStack.FlowEntry flowEntry) {
            flowEntry.getClass();
            this.flowEntry = flowEntry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartFlow) && Intrinsics.areEqual(this.flowEntry, ((StartFlow) obj).flowEntry);
        }

        public final int hashCode() {
            return this.flowEntry.hashCode();
        }

        public final String toString() {
            return "StartFlow(flowEntry=" + this.flowEntry + ")";
        }
    }

    public RealBackStackEditor(ArrayDeque arrayDeque, RealBackStack realBackStack, ErrorReporter errorReporter) {
        realBackStack.getClass();
        RealBackStack realBackStack2 = new RealBackStack();
        realBackStack2.entries = arrayDeque;
        this.entries = arrayDeque;
        this.parent = realBackStack;
        this.view = realBackStack2;
        this.errorReporter = errorReporter;
        this.ledger = new ArrayList();
    }

    public final void addBackstackMetadata(ConnectionPool connectionPool) {
        Pair pair = new Pair("entries", this.entries);
        RealBackStack realBackStack = this.view;
        Pair pair2 = new Pair("currentFlow", realBackStack.getCurrentFlow$real());
        RealBackStack.FlowEntry currentFlow$real = realBackStack.getCurrentFlow$real();
        Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("Backstack", MapsKt__MapsKt.mapOf(pair, pair2, new Pair("currentFlowName", currentFlow$real != null ? currentFlow$real.getName() : null), new Pair("currentFlowScreens", realBackStack.getCurrentFlowScreens()), new Pair("currentFlowScreensCount", Integer.valueOf(realBackStack.getCurrentFlowScreens().size())), new Pair("screenEntries", realBackStack.getScreenEntries()), new Pair("flowEntries", realBackStack.getFlowEntries$real()), new Pair("stateKeys", realBackStack.getStateKeys()), new Pair("ledger", this.ledger))));
        mapOf.getClass();
        connectionPool.delegate = MapsKt__MapsKt.plus((Map) connectionPool.delegate, mapOf);
    }

    public final void clear() {
        this.entries.clear();
        this.ledger.add(Cleared.INSTANCE);
    }

    public final synchronized void commit() {
        ErrorReporter errorReporter = this.errorReporter;
        ConnectionPool connectionPool = new ConnectionPool(21, false);
        try {
            if (this.committed) {
                addBackstackMetadata(connectionPool);
                throw new IllegalStateException("Commit called twice on editor");
            }
            this.committed = true;
            RealBackStack realBackStack = this.parent;
            ArrayDeque arrayDeque = this.entries;
            synchronized (realBackStack) {
                arrayDeque.getClass();
                realBackStack.currentEdit = null;
                realBackStack.entries = arrayDeque;
            }
        } catch (Throwable th) {
            Map map = (Map) connectionPool.delegate;
            if (!map.isEmpty()) {
                errorReporter.annotateException(th, map);
            }
            throw th;
        }
    }

    public final ArrayList getCurrentFlowScreens() {
        return this.view.getCurrentFlowScreens();
    }

    public final boolean inFlow() {
        ArrayList arrayList = (ArrayList) this.view.getFlowEntries$real();
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((RealBackStack.FlowEntry) it.next()).getName(), "blockers")) {
                return true;
            }
        }
        return false;
    }

    public final boolean isCurrentFlowScreensEmpty() {
        return this.view.isCurrentFlowScreensEmpty();
    }

    public final boolean isEmpty() {
        return this.view.isEmpty();
    }

    public final BackStack$ScreenEntry peekScreenInCurrentFlow() {
        return this.view.peekScreenInCurrentFlow();
    }

    public final void popCurrentFlowsIfEmpty() {
        int i;
        while (true) {
            ArrayDeque arrayDeque = this.entries;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.getSize());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                } else if (((BackStack$Entry) listIterator.previous()) instanceof RealBackStack.FlowEntry) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            if (i == -1) {
                return;
            }
            List subList = arrayDeque.subList(i + 1, arrayDeque.size);
            if (!(subList instanceof Collection) || !subList.isEmpty()) {
                Iterator it = subList.iterator();
                while (it.hasNext()) {
                    if (((BackStack$Entry) it.next()) instanceof BackStack$ScreenEntry) {
                        return;
                    }
                }
            }
            List subList2 = arrayDeque.subList(Math.max(i, 0), arrayDeque.size);
            subList2.getClass();
            ArrayList arrayList = this.ledger;
            arrayList.getClass();
            if (!subList2.isEmpty()) {
                List list = CollectionsKt.toList(subList2);
                list.getClass();
                arrayList.add(new PopCurrentFlowsIfEmpty(list));
            }
            subList2.clear();
        }
    }

    public final void popCurrentFlowsWithNames(String... strArr) {
        int i;
        ArrayList arrayList = new ArrayList();
        while (true) {
            ArrayDeque arrayDeque = this.entries;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.getSize());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                } else if (((BackStack$Entry) listIterator.previous()) instanceof RealBackStack.FlowEntry) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            if (i == -1) {
                break;
            }
            Object obj = arrayDeque.get(i);
            obj.getClass();
            RealBackStack.FlowEntry flowEntry = (RealBackStack.FlowEntry) obj;
            if (!ArraysKt___ArraysKt.contains(strArr, flowEntry.getName())) {
                break;
            }
            List subList = arrayDeque.subList(i, arrayDeque.size);
            subList.getClass();
            if (!subList.isEmpty()) {
                List list = CollectionsKt.toList(subList);
                list.getClass();
                arrayList.add(new ClearedFlow(flowEntry.getName(), list));
            }
            subList.clear();
        }
        ArrayList arrayList2 = this.ledger;
        arrayList2.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        List list2 = CollectionsKt.toList(arrayList);
        list2.getClass();
        arrayList2.add(new PopCurrentFlowsWithNames(list2));
    }

    public final void popFlow(String str) {
        int i;
        ArrayDeque arrayDeque = this.entries;
        ListIterator listIterator = arrayDeque.listIterator(arrayDeque.getSize());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            BackStack$Entry backStack$Entry = (BackStack$Entry) listIterator.previous();
            if ((backStack$Entry instanceof RealBackStack.FlowEntry) && Intrinsics.areEqual(((RealBackStack.FlowEntry) backStack$Entry).getName(), str)) {
                i = listIterator.nextIndex();
                break;
            }
        }
        ConnectionPool connectionPool = new ConnectionPool(21, false);
        if (i != -1) {
            List subList = arrayDeque.subList(i, arrayDeque.size);
            subList.getClass();
            ArrayList arrayList = this.ledger;
            arrayList.getClass();
            if (!subList.isEmpty()) {
                List list = CollectionsKt.toList(subList);
                list.getClass();
                arrayList.add(new PopFlow(new ClearedFlow(str, list)));
            }
            subList.clear();
            return;
        }
        try {
            addBackstackMetadata(connectionPool);
            List flowEntries$real = this.view.getFlowEntries$real();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(flowEntries$real, 10));
            Iterator it = ((ArrayList) flowEntries$real).iterator();
            while (it.hasNext()) {
                arrayList2.add(((RealBackStack.FlowEntry) it.next()).getName());
            }
            throw new IllegalArgumentException(("Flow with name " + str + " was not found in " + arrayList2 + ".").toString());
        } catch (Throwable th) {
            Map map = (Map) connectionPool.delegate;
            if (!map.isEmpty()) {
                this.errorReporter.annotateException(th, map);
            }
            throw th;
        }
    }

    public final BackStack$ScreenEntry popScreen() {
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = this.entries;
        int i = arrayDeque.size;
        while (true) {
            i--;
            if (-1 >= i) {
                break;
            }
            BackStack$Entry backStack$Entry = (BackStack$Entry) arrayDeque.get(i);
            if (!(backStack$Entry instanceof RealBackStack.Mark)) {
                if (!(backStack$Entry instanceof BackStack$ScreenEntry)) {
                    if (backStack$Entry instanceof RealBackStack.FlowEntry) {
                        break;
                    }
                } else {
                    Object removeAt = arrayDeque.removeAt(i);
                    ArrayList arrayList2 = this.ledger;
                    arrayList2.getClass();
                    BackStack$Entry backStack$Entry2 = (BackStack$Entry) removeAt;
                    backStack$Entry2.getClass();
                    arrayList2.add(new PopScreen((BackStack$ScreenEntry) backStack$Entry2, arrayList));
                    return (BackStack$ScreenEntry) backStack$Entry;
                }
            } else {
                BackStack$Entry backStack$Entry3 = (BackStack$Entry) arrayDeque.removeAt(i);
                backStack$Entry3.getClass();
                arrayList.add((RealBackStack.Mark) backStack$Entry3);
            }
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("no entry to pop in the current flow");
        return null;
    }

    public final boolean popToMarkIfOwnerMatches(String str, String str2) {
        str.getClass();
        str2.getClass();
        ArrayDeque arrayDeque = this.entries;
        Iterator it = arrayDeque.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            BackStack$Entry backStack$Entry = (BackStack$Entry) it.next();
            if ((backStack$Entry instanceof RealBackStack.Mark) && Intrinsics.areEqual(((RealBackStack.Mark) backStack$Entry).getId(), str)) {
                break;
            }
            i++;
        }
        ConnectionPool connectionPool = new ConnectionPool(21, false);
        if (i == -1) {
            try {
                addBackstackMetadata(connectionPool);
                throw new IllegalArgumentException(("A mark with ID '" + str + "' was not found in the stack: " + this).toString());
            } catch (Throwable th) {
                Map map = (Map) connectionPool.delegate;
                if (!map.isEmpty()) {
                    this.errorReporter.annotateException(th, map);
                }
                throw th;
            }
        }
        Object obj = arrayDeque.get(i);
        obj.getClass();
        if (!Intrinsics.areEqual(((RealBackStack.Mark) obj).getOwner(), str2)) {
            return false;
        }
        List subList = arrayDeque.subList(i, arrayDeque.size);
        subList.getClass();
        ArrayList arrayList = this.ledger;
        arrayList.getClass();
        if (!subList.isEmpty()) {
            List list = CollectionsKt.toList(subList);
            list.getClass();
            arrayList.add(new PopToMarkIfOwnerMatches(str, str2, list));
        }
        subList.clear();
        return true;
    }

    public final void push(BackStack$ScreenEntry backStack$ScreenEntry) {
        AvatarsKt$$ExternalSyntheticLambda2 avatarsKt$$ExternalSyntheticLambda2 = new AvatarsKt$$ExternalSyntheticLambda2(2);
        ArrayList arrayList = this.ledger;
        arrayList.getClass();
        arrayList.add(avatarsKt$$ExternalSyntheticLambda2.invoke(backStack$ScreenEntry));
        this.entries.addLast(backStack$ScreenEntry);
    }

    public final void resetBeforeMark(String str) {
        str.getClass();
        ArrayDeque arrayDeque = this.entries;
        Iterator it = arrayDeque.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            BackStack$Entry backStack$Entry = (BackStack$Entry) it.next();
            if ((backStack$Entry instanceof RealBackStack.Mark) && Intrinsics.areEqual(((RealBackStack.Mark) backStack$Entry).getId(), str)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        List subList = arrayDeque.subList(i, arrayDeque.size);
        subList.getClass();
        ArrayList arrayList = this.ledger;
        arrayList.getClass();
        if (!subList.isEmpty()) {
            List list = CollectionsKt.toList(subList);
            list.getClass();
            arrayList.add(new ResetBeforeMark(str, list));
        }
        subList.clear();
    }

    public final ArrayList screensPrecedingFlow() {
        int i;
        int i2;
        RealBackStack realBackStack = this.view;
        ArrayDeque arrayDeque = realBackStack.entries;
        ListIterator listIterator = arrayDeque.listIterator(arrayDeque.getSize());
        while (true) {
            i = -1;
            if (!listIterator.hasPrevious()) {
                i2 = -1;
                break;
            }
            BackStack$Entry backStack$Entry = (BackStack$Entry) listIterator.previous();
            RealBackStack.FlowEntry flowEntry = backStack$Entry instanceof RealBackStack.FlowEntry ? (RealBackStack.FlowEntry) backStack$Entry : null;
            if (Intrinsics.areEqual(flowEntry != null ? flowEntry.getName() : null, "blockers")) {
                i2 = listIterator.nextIndex();
                break;
            }
        }
        if (i2 == -1) {
            List flowEntries$real = realBackStack.getFlowEntries$real();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(flowEntries$real, 10));
            Iterator it = ((ArrayList) flowEntries$real).iterator();
            while (it.hasNext()) {
                arrayList.add(((RealBackStack.FlowEntry) it.next()).getName());
            }
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Request$Priority$EnumUnboxingLocalUtility.m("Flow with name blockers not found in ", ".", arrayList));
            return null;
        }
        if (i2 <= 0) {
            List flowEntries$real2 = realBackStack.getFlowEntries$real();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(flowEntries$real2, 10));
            Iterator it2 = ((ArrayList) flowEntries$real2).iterator();
            while (it2.hasNext()) {
                arrayList2.add(((RealBackStack.FlowEntry) it2.next()).getName());
            }
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Request$Priority$EnumUnboxingLocalUtility.m("Flow with name blockers has nothing before it in ", ".", arrayList2));
            return null;
        }
        List subList = realBackStack.entries.subList(0, i2);
        ListIterator listIterator2 = subList.listIterator(subList.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                break;
            }
            if (((BackStack$Entry) listIterator2.previous()) instanceof RealBackStack.FlowEntry) {
                i = listIterator2.nextIndex();
                break;
            }
        }
        List subList2 = realBackStack.entries.subList(i + 1, i2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : subList2) {
            if (obj instanceof BackStack$ScreenEntry) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    public final void startFlow(String str, FlowData flowData) {
        RealBackStack realBackStack = this.view;
        ConnectionPool connectionPool = new ConnectionPool(21, false);
        try {
            if (realBackStack.getCurrentFlow$real() != null && realBackStack.getCurrentFlowScreens().size() <= 0) {
                addBackstackMetadata(connectionPool);
                throw new IllegalStateException(("A new flow (name: " + str + ") was started without an entry in the previous flow (name: " + ((RealBackStack.FlowEntry) CollectionsKt.last(realBackStack.getFlowEntries$real())).getName() + ").").toString());
            }
            RealBackStack.FlowEntry flowEntry = new RealBackStack.FlowEntry(flowData, str);
            ArrayList arrayList = this.ledger;
            arrayList.getClass();
            arrayList.add(new StartFlow(flowEntry));
            this.entries.addLast(flowEntry);
        } catch (Throwable th) {
            Map map = (Map) connectionPool.delegate;
            if (!map.isEmpty()) {
                this.errorReporter.annotateException(th, map);
            }
            throw th;
        }
    }

    public final String toString() {
        return this.entries.toString();
    }
}
