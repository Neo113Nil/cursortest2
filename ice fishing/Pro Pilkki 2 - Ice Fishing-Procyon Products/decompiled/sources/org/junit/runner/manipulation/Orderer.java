package org.junit.runner.manipulation;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.junit.runner.Description;

/* JADX INFO: loaded from: classes.dex */
public final class Orderer {
    private final Ordering ordering;

    Orderer(Ordering ordering) {
        this.ordering = ordering;
    }

    public List<Description> order(Collection<Description> collection) throws InvalidOrderingException {
        List<Description> listOrderItems = this.ordering.orderItems(Collections.unmodifiableCollection(collection));
        if (this.ordering.validateOrderingIsCorrect()) {
            HashSet hashSet = new HashSet(collection);
            if (!hashSet.containsAll(listOrderItems)) {
                throw new InvalidOrderingException("Ordering added items");
            }
            HashSet hashSet2 = new HashSet(listOrderItems);
            if (hashSet2.size() != listOrderItems.size()) {
                throw new InvalidOrderingException("Ordering duplicated items");
            }
            if (!hashSet2.containsAll(hashSet)) {
                throw new InvalidOrderingException("Ordering removed items");
            }
        }
        return listOrderItems;
    }

    public void apply(Object obj) throws InvalidOrderingException {
        if (obj instanceof Orderable) {
            ((Orderable) obj).order(this);
        }
    }
}
