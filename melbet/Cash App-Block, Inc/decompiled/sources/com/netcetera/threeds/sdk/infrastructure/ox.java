package com.netcetera.threeds.sdk.infrastructure;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class ox {
    private LinkedList initialize;
    private oz get = new oz(null);
    private pf ThreeDS2ServiceInstance = null;
    private int getWarnings = 0;

    private int ThreeDS2ServiceInstance(LinkedList linkedList) {
        if (linkedList.size() == 0) {
            return -1;
        }
        return ((Integer) linkedList.getFirst()).intValue();
    }

    private List initialize(pa paVar) {
        List initialize;
        return (paVar == null || (initialize = paVar.initialize()) == null) ? new ov() : initialize;
    }

    public Object get(String str, pa paVar) {
        try {
            return getWarnings(new StringReader(str), paVar);
        } catch (IOException e) {
            throw new oy(-1, 2, e);
        }
    }

    public Object getWarnings(Reader reader, pa paVar) {
        initialize(reader);
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        do {
            getWarnings();
            int i = this.getWarnings;
            if (i == -1) {
                throw new oy(ThreeDS2ServiceInstance(), 1, this.ThreeDS2ServiceInstance);
            }
            if (i == 0) {
                int i2 = this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance;
                if (i2 == 0) {
                    this.getWarnings = 1;
                    linkedList.addFirst(new Integer(1));
                    linkedList2.addFirst(this.ThreeDS2ServiceInstance.getWarnings);
                } else if (i2 == 1) {
                    this.getWarnings = 2;
                    linkedList.addFirst(new Integer(2));
                    linkedList2.addFirst(getWarnings(paVar));
                } else if (i2 != 3) {
                    this.getWarnings = -1;
                } else {
                    this.getWarnings = 3;
                    linkedList.addFirst(new Integer(3));
                    linkedList2.addFirst(initialize(paVar));
                }
            } else {
                if (i == 1) {
                    if (this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance == -1) {
                        return linkedList2.removeFirst();
                    }
                    throw new oy(ThreeDS2ServiceInstance(), 1, this.ThreeDS2ServiceInstance);
                }
                if (i == 2) {
                    pf pfVar = this.ThreeDS2ServiceInstance;
                    int i3 = pfVar.ThreeDS2ServiceInstance;
                    if (i3 == 0) {
                        Object obj = pfVar.getWarnings;
                        if (obj instanceof String) {
                            linkedList2.addFirst((String) obj);
                            this.getWarnings = 4;
                            linkedList.addFirst(new Integer(4));
                        } else {
                            this.getWarnings = -1;
                        }
                    } else if (i3 != 2) {
                        if (i3 != 5) {
                            this.getWarnings = -1;
                        }
                    } else if (linkedList2.size() > 1) {
                        linkedList.removeFirst();
                        linkedList2.removeFirst();
                        this.getWarnings = ThreeDS2ServiceInstance(linkedList);
                    } else {
                        this.getWarnings = 1;
                    }
                } else if (i == 3) {
                    int i4 = this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance;
                    if (i4 == 0) {
                        ((List) linkedList2.getFirst()).add(this.ThreeDS2ServiceInstance.getWarnings);
                    } else if (i4 == 1) {
                        List list = (List) linkedList2.getFirst();
                        Map warnings = getWarnings(paVar);
                        list.add(warnings);
                        this.getWarnings = 2;
                        linkedList.addFirst(new Integer(2));
                        linkedList2.addFirst(warnings);
                    } else if (i4 == 3) {
                        List list2 = (List) linkedList2.getFirst();
                        List initialize = initialize(paVar);
                        list2.add(initialize);
                        this.getWarnings = 3;
                        linkedList.addFirst(new Integer(3));
                        linkedList2.addFirst(initialize);
                    } else if (i4 != 4) {
                        if (i4 != 5) {
                            this.getWarnings = -1;
                        }
                    } else if (linkedList2.size() > 1) {
                        linkedList.removeFirst();
                        linkedList2.removeFirst();
                        this.getWarnings = ThreeDS2ServiceInstance(linkedList);
                    } else {
                        this.getWarnings = 1;
                    }
                } else if (i == 4) {
                    int i5 = this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance;
                    if (i5 == 0) {
                        linkedList.removeFirst();
                        ((Map) linkedList2.getFirst()).put((String) linkedList2.removeFirst(), this.ThreeDS2ServiceInstance.getWarnings);
                        this.getWarnings = ThreeDS2ServiceInstance(linkedList);
                    } else if (i5 == 1) {
                        linkedList.removeFirst();
                        String str = (String) linkedList2.removeFirst();
                        Map map = (Map) linkedList2.getFirst();
                        Map warnings2 = getWarnings(paVar);
                        map.put(str, warnings2);
                        this.getWarnings = 2;
                        linkedList.addFirst(new Integer(2));
                        linkedList2.addFirst(warnings2);
                    } else if (i5 == 3) {
                        linkedList.removeFirst();
                        String str2 = (String) linkedList2.removeFirst();
                        Map map2 = (Map) linkedList2.getFirst();
                        List initialize2 = initialize(paVar);
                        map2.put(str2, initialize2);
                        this.getWarnings = 3;
                        linkedList.addFirst(new Integer(3));
                        linkedList2.addFirst(initialize2);
                    } else if (i5 != 6) {
                        this.getWarnings = -1;
                    }
                }
            }
            if (this.getWarnings == -1) {
                throw new oy(ThreeDS2ServiceInstance(), 1, this.ThreeDS2ServiceInstance);
            }
        } while (this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance != -1);
        throw new oy(ThreeDS2ServiceInstance(), 1, this.ThreeDS2ServiceInstance);
    }

    public int ThreeDS2ServiceInstance() {
        return this.get.ThreeDS2ServiceInstance();
    }

    public void initialize(Reader reader) {
        this.get.initialize(reader);
        initialize();
    }

    public void initialize() {
        this.ThreeDS2ServiceInstance = null;
        this.getWarnings = 0;
        this.initialize = null;
    }

    private void getWarnings() {
        pf pfVar = this.get.get();
        this.ThreeDS2ServiceInstance = pfVar;
        if (pfVar == null) {
            this.ThreeDS2ServiceInstance = new pf(-1, null);
        }
    }

    private Map getWarnings(pa paVar) {
        if (paVar == null) {
            return new ow();
        }
        Map warnings = paVar.getWarnings();
        return warnings == null ? new ow() : warnings;
    }
}
